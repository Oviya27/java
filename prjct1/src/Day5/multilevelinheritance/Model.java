package Day5.multilevelinheritance;

public class Model {
	void name() {
		System.out.println("Name");
	}
	void price() {
		System.out.println("Price");
	}
	void mileage() {
		System.out.println("Mileage");
	}

	public static void main(String[] args) {
		Model m = new Model();
		m.name();
		m.price();
		m.mileage();
		
        m.brake();
        m.color();
        
        m.speed();
        m.founder();
        
		
	}
	

}
