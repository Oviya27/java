package day16.userdefinedobject.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day15.userDefinedFunction.Student;

public class ListDemo {

	public static <student> void main(String[] args) {
		List<student> studentlist=new ArrayList<student>();
		
		student s1 = new student(11, "Oviya", 45);
		student s2 = new student(12, "Tamil", 55);
		student s3 = new student(13, "Rabina", 65);
		student s4 = new student(14, "Ramya", 75);
		
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		 System.out.println("Student Details:"+studentlist);
		 
		 
		 Collections.sort(studentlist);
		 System.out.println(studentlist);
		 
		 
		 List<Person> personlist=new ArrayList<Person>();
		 	Person p1 = new Person("chennai", "Oviya");
		 	Person p2 = new Person("MVP", "Tamil");
		 	Person p3 = new Person("ooty", "Rabina");
		 	Person p4 = new Person("Trichy", "Ramya");
			
		 	personlist.add(p1);
		 	personlist.add(p2);
		 	personlist.add(p3);
		 	personlist.add(p4);
		 	
			 System.out.println("-----------Before Storing---------");
			 System.out.println(personlist);
			 
			 
			 Collections.sort(personlist, new SortByCity());
			 System.out.println("-----------After Storing---------");
			 System.out.println(personlist);
			 
	}

}
