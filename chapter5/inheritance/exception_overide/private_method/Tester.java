public class Tester{

	public static void main(String[] args) throws Exception{
		Lion l = new Lion();
		String s=l.printName();
		Animal m = new Lion();
		m.printName();// compile time error. can't access private method.
				// this happens since there's no override on methods happened. so m.printName() accesss private method	
	}

}
