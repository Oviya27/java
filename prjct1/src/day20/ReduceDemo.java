package day20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(1, 2,-3, 4, 5, -6, 7, -8);
		
		Stream<Integer> stream = n.stream();
		
		stream = stream.filter((a) -> a > 0);
		System.out.println(stream);
		stream.map(num -> num).forEach(System.out::println);
		
		Optional<Integer> result = stream.reduce((a, b) -> a > b? a : b);
		if(result.isPresent()) {
			System.out.println("Result: "+result.get());
			
		}
		stream = n.stream();
		
		result = stream.reduce((a, b) -> a+b);
		
		stream = n.stream();
		
		stream = stream.filter((a) -> a % 2 == 0);
		
	}
}

		
				
		


