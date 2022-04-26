package principal.principal.atividade2604;

public final class Chocolateboiler {
	private boolean empty;
	private boolean boiled;
        private static Chocolateboiler instance;
	
	private Chocolateboiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {  
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
            if (!isEmpty() && !isBoiled()) {
			boiled = true; 
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
        
        public static Chocolateboiler getInstance() {
            if (instance == null) {
                instance = new Chocolateboiler();
            }
            return instance;
        }
	
}