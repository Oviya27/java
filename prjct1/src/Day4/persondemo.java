package Day4;

public class persondemo {

	public static void main(String[] args) {
		person p = new person();
		int n = 40;
		p.setNumber(n);
		
		p = new person(n);
		System.out.println("Number is: "+p.getNumber());
	}

	}
