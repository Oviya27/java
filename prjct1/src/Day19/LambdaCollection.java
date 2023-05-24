package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
	    list.add(10);
		list.add(40);
		list.add(30);
		System.out.println(list);
		
		
		for(Integer element : list) {
			System.out.println(element);
			
			}
		System.out.println("Traversing using Lambda exp");
		list.forEach(element -> System.out.println(element));
		
		System.out.println("Original List: "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse order: "+list);
		
		
		Comparator<Integer> comp = (n1, n2) -> n2 - n1;
		Collections.sort(list, comp);
		System.out.println("Lambda exp to print the list in Descending order"+list);
		
		ArrayList<Student> stud = new ArrayList<Student>();
		Student s1 = new Student(23, "Raj", 77);
		stud.add(s1);
		s1 = new Student(12,"Oviya", 90);
		stud.add(s1);
		s1 = new Student(5,"Jai", 78);
		stud.add(s1);
		s1 = new Student(17, "Tamil", 89);
		stud.add(s1);
		
		System.out.println(stud);
		
		Comparator<Student> comp1 = (st1, st2) -> (int) (st1.getRollNo() - st2.getRollNo());
		Collections.sort(stud, comp1);
		System.out.println("Student details in Ascending order");
		System.out.println(stud);
		
		
		
		
		
	}

}
