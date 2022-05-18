import java.util.ArrayList;
import java.util.List;

public class Primenumber {
	
	public static void main(String[] args)
	{
		List<Integer> collect = new ArrayList<>();
		
		Boolean value = isPrime(3);
		System.out.println(value);
		
		for(int i=0;i<1000;i++)
		{
			if(isPrime(i))
			{
				collect.add(i);
			}
		}
		System.out.println(collect);
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

}
