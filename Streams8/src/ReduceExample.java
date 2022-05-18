import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Optional<Integer> i = numbers.stream().reduce((a,b) -> a+b);
		//System.out.println(i);
		
		numbers.stream().map(i->i*i).filter(x->x<=4).forEach(System.out::println);
		OptionalDouble avg = numbers.stream().mapToInt(i->i*i).filter(x->x<=4).average();
		OptionalInt avg1 = numbers.stream().mapToInt(i->i*i).max();
		
		System.out.println(avg1);

}
}
