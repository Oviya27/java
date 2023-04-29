package Day5.multilevelinheritance;

public class Audi extends Car {
	void symbol() {
		System.out.println("Symbol");
	}
	void founder() {
		System.out.println("Founder");
	}

	public static void main(String[] args) {
		Audi t = new Audi();
		t.symbol();
		t.founder();
		t.brake();
		t.speed();
		t.color();

	}

}
