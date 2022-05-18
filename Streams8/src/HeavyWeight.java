

	public class HeavyWeight implements ApplePredicate
	{
		@Override
		public boolean test(Apple apple) {
			
			return apple.getWeight()>100;
		}
	}



