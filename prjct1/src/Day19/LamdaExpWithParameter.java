package Day19;

public class LamdaExpWithParameter {
	public static void main(String args[]) {
	int x = 5;
	cube c = (int a) -> {
		return a*a*a;
	};
	int res = c.calculate(5);
	System.out.println(res);
	
	cube d = (int a)->a*a*a;
	int result = d.calculate(x);
	System.out.println(result);
	
	IsOdd o = (a) -> a%2 !=0 ? true : false;
	boolean a = o.checkodd(7);
	System.out.println(a);
	boolean b = o.checkodd(6);
	System.out.println(b);
	
	
	
	}
	
}
