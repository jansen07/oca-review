public class Tester{
	public static void main(String[] args) throws Exception{
		Lion l = new Lion();
		l.getName(); // prints -> Lion Method

		Animal m = new Lion(); 
		m.getName(); // prints -> Lion Method

		Animal m1 = new Animal();
		m1.getName(); // prints -> Animal Method

	
	}

}
