import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Chapter1 {
	
	
	
	
	
	//List<Apple> apple1 = new ArrayList<>();
	

	public static void main(String[] args) {
		
		List<Apple> AppleValues = Arrays.asList(new Apple("green",50),new Apple("red",150));
				List<Apple> heavyApples = filterApples(AppleValues,new HeavyWeight());
				
				AppleValues.sort(new Comparator<Apple>() {

					@Override
					public int compare(Apple o1, Apple o2) {
						// TODO Auto-generated method stub
						return o1.getWeight().compareTo(o2.getWeight());
					}
					
				});
				
				AppleValues.sort((Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

	}

	private static List<Apple> filterApples(List<Apple> apples, HeavyWeight p) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple:apples)
		{
			if(p.test(apple))
			{
				result.add(apple);
			}
		}
		
		return result;
		
	}

}



