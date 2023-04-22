package Array;

public class arraydemo {
	static void printArray(int arr[]) {
		for(int i = 0;i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		}
	public static int getSum(int...n) {
		int sum=0;
		for(int no: n) {
			sum +=no;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n =10;
		int a[];
		a=new int[n];
		printArray(a);
		for(int i=0;i<a.length;i++) {
			a[i]=5*i;
			}
            printArray(a);
            int b[]= {10,20,30,40,50,60};
            printArray(b);
            System.out.println("sum of array elements is:"+getSum(b));
            System.out.println("sum of array elements is:"+getSum(12,32,22));
	}
}

