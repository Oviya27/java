package Array;

public class arrayofobjectdemo {

	public static void main(String[] args) {
		student[] arr;
		arr =new student[5];
		arr[0]=new student(12,"oviya");
		arr[1]=new student(30,"rabina");
		arr[2]=new student(19,"tamil");
		arr[3]=new student(23,"hari");
		arr[4]=new student(9,"dhanya");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at "+i":"+arr(i).getRollno()+" "+arr(i).getname());
		}

	}

}
