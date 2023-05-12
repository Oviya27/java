package day20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasic {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30,40,50);
		System.out.println(stream);
		
		stream.map(num -> num+5).forEach(System.out::println);
		
		Integer[] v = new Integer[] {10,20,30,40,50,60};
		stream = Arrays.stream(v);
		stream.map(num -> num+num).forEach(System.out::println);
		
		System.out.println("-------Basic-------");
		Arrays.stream(v).limit(3).forEach(System.out::println);
		System.out.println("-------Basic-------");
		Arrays.stream(v).limit(3).forEach(System.out::println);
		System.out.println("-------Basic-------");
		Arrays.stream(v).limit(3).forEach(System.out::println);
		
	    List<String> s = Arrays.asList("Hello", "c9", "students");
		
	}

}
