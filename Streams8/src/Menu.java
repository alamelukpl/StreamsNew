import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Menu {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork",false,800,"Meat"),
		new Dish("french fries",false,800,"Other"),
		new Dish("Salmon",true,300,"fish"),
		new Dish("rice",false,200,"Other"),
		new Dish("pizza",false,800,"Other"));
		List<String> lowCaloriesDish = menu.stream().filter(d-> d.getCalories() < 400)
				
				.map(Dish::getName)
				.limit(1)
				.collect(Collectors.toList());
	
		//Map<,List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
		System.out.println(lowCaloriesDish);
		
		List<String> title = Arrays.asList("Hello","Inside","outside");
		/*Iterator<String> itr = title.iterator();
		while(itr.hasNext())
		{
			String d = itr.next();
			
		}
		Stream<String> s = title.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);*/
		
		List<String> names = menu.stream().filter(d ->{
			System.out.println("filtered name" + d.getName());
			return d.getCalories() > 300;
			
		}).map(d->
		{
			System.out.println("mapped" + d.getName());
			return d.getName();
		}).collect(Collectors.toList());
		
		List<Integer> vegetarian = menu.stream().map(Dish::getCalories).collect(Collectors.toList());
		System.out.println(vegetarian);
		
		List<Dish> dishes = menu.stream().filter(d-> d.getType() == "Other").limit(3).collect(Collectors.toList());
		System.out.println(dishes);
		
		List<Integer> dishnames = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
		System.out.println(dishnames);
		
		if(menu.stream().anyMatch(Dish::isVegetarian))
		{
			System.out.println("veg is there");
		}
		
		OptionalInt s = menu.stream().mapToInt(Dish::getCalories).reduce(Integer::sum);
		
		menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(d->System.out.println(d.getName()));
		menu.stream().mapToInt(Dish::getCalories).sum();
		
		int c = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
		System.out.println("Sum : " + c);
		String m = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println("joining"  + m);
		IntStream.range(1, 100).filter(i->i%2==0);
		
		Comparator<Dish> dishCaloriesComparator= Comparator.comparing(Dish::getCalories);
		//Optional<Dish> mc = menu.stream().collect(maxBy(dishCaloriesComparator));
		boolean healthy = menu.stream().allMatch(d->d.getCalories()<1000);
		System.out.println(healthy);
		
	}

	
}
