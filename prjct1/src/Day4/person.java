package Day4;

public class person {
	public person() {
		System.out.println("Default constructor");
	}
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String toString() {
		return "Person [number=" + number + "]";
	}
	public person(int number) {		
		this.number = number;
		System.out.println(number);
	}

}
