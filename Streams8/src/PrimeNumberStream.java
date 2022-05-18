import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		
		//long count = numbers.stream().filter(PrimeNumberStream::isPrime).peek(x->System.out.println(x)).count();
		//System.out.println(count);
		
		long count1 = Stream.iterate(0, n->n+1).limit(1000)
				.filter(PrimeNumberStream::isPrimeStream).peek(x->System.out.println(x)).count();
		
		List<Integer> boxed = Stream.iterate(0, n->n+1).limit(1000)
				.filter(PrimeNumberStream::isPrimeStream).collect(Collectors.toList());
		
		System.out.println("using list" + boxed);
		
		
		System.out.println(count1);
		//List<Integer> prime = numbers.stream().filter(PrimeNumberStream::isPrime).collect(Collectors.toList());
		//System.out.println(prime);
	}
	
	private static boolean isPrime(int i) {
		if(i<=1)
		{
			return false;
		}
		for(int j=2;j*j <=i;j++)
		{
			if(i%j ==0)
				return false;
		}
		return true;
	}
	
	private static boolean isPrimeStream(int number)
	{
		if(number <= 1)
			return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i ==0);
		//IntStream.rangeClosed(2, number/2).filter(null)
		
		
		//IntStream random1 = IntStream.generate( () -> { return (int) Math.random() * 100;});
		
	
		
		//IntStream random = IntStream.generate( () -> { return (int) Math.random() * 5000;});
		
	}

}
