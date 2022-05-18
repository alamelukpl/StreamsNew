import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMap {

	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(1,2,3);
		List<Integer> num2 = Arrays.asList(4,5,6);
		List<int[]> pairs = num1.stream().flatMap(i->num2.stream().map(j->new int[] {i,j})).collect(Collectors.toList());
		System.out.println(pairs);
		
		int firstMin = num1.stream().reduce(Integer::min).get();
		
		int secondMin = num1.stream().filter(i -> i != firstMin).reduce(Integer::min).get();
		
		num1.sort(Comparator.naturalOrder());
	
		
		System.out.println("first min"   + firstMin);
		System.out.println("second min" + secondMin);
		
		List<Integer> numbers = Arrays.asList(1,2,2,4,4,6,7,8);
		Optional<Integer> n = numbers.stream().reduce(Integer::min);
		System.out.println(n);
		int count = numbers.stream().reduce(0,(a,b) -> a+b);
		//int count1 = numbers.parallelStream().reduce(0,Integer::Sum);
		System.out.println(count);
		//numbers.stream().filter(i->i%2 == 0).distinct().forEach(System.out::println);
		

	}

}
