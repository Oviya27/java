package day16.Vector;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		animals.add("Goat");
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Rat");
		
		System.out.println("Initial Vector:"+animals);
		
		
		System.out.println("Element at index 2:"+animals.get(2));
		
		
		Iterator<String> iterate= animals.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());	
		}
		
		String element = animals.remove(1);
		System.out.println("Removed element is:"+element);
		
		System.out.println("new Vector is:"+animals);
		
		
		animals.clear();
		System.out.println(animals);
		
		
	}

}
