import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSolution {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader sam = new Trader("Sam","Milan");
		Trader mike = new Trader("Mike","Uk");
		Trader peter = new Trader("Peter","Uk");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(raoul,2011,300),
				new Transaction(sam,2012,600),
				new Transaction(mike,2011,1300),
				new Transaction(peter,2011,800));
		
		
		List<Transaction> tr2011 = transactions.stream().filter(t->t.getYear()==2011)
				
				.collect(Collectors.toList());
		
		List<String> city = transactions.stream().map(t->t.getTrader().getCity()).distinct().collect(Collectors.toList());
		
		
		transactions.stream().map(Transaction::getTrader).filter(t->t.getCity()=="Uk")
		.collect(Collectors.toList());
		
		transactions.stream().anyMatch(T-> T.getTrader().getCity()=="UK");
		transactions.stream().filter(T-> T.getTrader().getCity() == "UK").map(Transaction::getValue).forEach(System.out::println);
		transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		System.out.println(city);
		System.out.println(tr2011);
		
				

	}

	private static Comparator<? super Trader> Comparing(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
