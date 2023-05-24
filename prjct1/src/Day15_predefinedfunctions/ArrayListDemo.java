package Day15_predefinedfunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1 =new ArrayList();
		System.out.println("size :"+list1.size());
		System.out.println("Is empty?"+list1.isEmpty());
		list1.add(15);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add('B');
		list1.add(4.4);
		list1.add("Oviya");
		System.out.println("List is :"+list1);
		System.out.println("Is the list contain 15:"+list1);
	    list1.remove(true);
	    list1.remove(1);
	    System.out.println("List is:"+list1);
	    
	    List<String> names = new ArrayList<String>();
	    names.add("Oviya");
	    names.add("Lakshitha");
	    names.add("Dhanya");
	    names.add("Pappu");
	    
	    System.out.println("Names before sorting are:"+names);
	    Collections.reverse(names);
	    System.out.println("List in reverse order:"+names);
	    Collections.sort(names);
	    System.out.println("Ascending order:"+names);
	    Collections.reverse(names);
	    System.out.println("Descending order:"+names);
	    
	    System.out.println("------------Traversing a list----------");
	    Iterator<String> i = names.iterator();
	    while(i.hasNext()) {
	    	String nm = i.next();
	    	System.out.println(nm);
	    	
	    }
	    System.out.println("--------Traversing list in reverse--------");
	    ListIterator<String> li = names.listIterator(names.size());
	    while(li.hasPrevious())  {
	    	String nm = li.previous();
	    	System.out.println(nm);
	    	
	    }
	    
	    
	    
	    
	}


}
