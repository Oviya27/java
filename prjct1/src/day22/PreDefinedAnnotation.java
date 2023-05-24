package day22;

import java.util.ArrayList;
import java.util.List;

public class PreDefinedAnnotation {
    @SuppressWarnings(value = { "unchecked"})
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List a1 = new ArrayList();
		Student s2 = new Student(23,"Oviya", "IT");
		a1.add(s2);
		a1.add(10);
		a1.add(22.22f);
		a1.add(new Student(12, "Kalai","CSE"));
		a1.add("Hi Everyone");
		
    }		

}
