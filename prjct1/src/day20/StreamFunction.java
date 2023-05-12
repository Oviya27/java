package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunction {
	public static long countEmptyString(Stream<String> stream) {
		long count = 0;
		count = stream.filter(x -> x.isEmpty()).count();
		return count;	
	}
	
	public static long countStrings(Stream<String> stream, int n) {
		long num = stream.filter(x -> x.length() > n).count();
		return num;	
	}
	public static List<String> stringList(Stream<String> stream){
	    List<String> filtered = stream.filter(x -> !x.isEmpty()).collect(Collectors.toList());
	    return filtered;
	    
}
   public static List<String> getStrings(Stream<String> stream, int n){
       List<String> filteredList = stream.filter(x -> x.isEmpty()).collect(Collectors.toList());
       return filteredList;
   }
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats = stream.mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in list: "+stats.getMax());
		System.out.println("Lowest prime number in list: "+stats.getMin());
		System.out.println("Sum of all prime number in list: "+stats.getSum());
		System.out.println("Average of all prime number in list: "+stats.getAverage());
		}
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("", "Chennai", "Bangalore", "Mumbai", "Pondy");
		
		System.out.println("List of Cities: "+strList);
		
		Stream<String> stream = strList.stream();
		
		long count = countEmptyString(strList.stream());
		System.out.printf("List %s has %d empty strings"+strList, count);
		
		count = countStrings(strList.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8"+strList, count);
		
		List<String> filteredList = stringList(strList.stream());
		System.out.println("Original List: %s without empty strings"+filteredList);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		Stream<Integer> stream1 = numbers.stream();
		
		showStatistics(numbers.stream());
		
	}
}
