import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Chapter2 {

	public static void main(String[] args) {
		List<Integer> l = map(Arrays.asList("in","one","three"),(String s) -> s.length()
				);
	}

	private static<T,R> List<R> map(List<T> asList, Function<T,R> f) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public static<T,R> List<R> map(List<T> list,Function<T,R> f)
	{
		
		List<R> result = new ArrayList<>();
		for(T a:list)
		{
			result.add(f.apply(a));
		}
		return result;
		
	}*/

}
