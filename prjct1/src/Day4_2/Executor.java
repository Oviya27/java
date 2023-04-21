package Day4_2;

import Day4.Base;
public class Executor {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodPublic();
		
		b.varPublic = 22;
		b.methodPublic();
	}
	}

