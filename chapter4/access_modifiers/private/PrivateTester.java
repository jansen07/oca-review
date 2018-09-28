public class PrivateTester{

	public static void main(String[] args){
	
		PrivatePerson p = new PrivatePerson();

		String firstName = p.firstName;// compile error -> private access modifier
		p.printName(); // compile error private access modifier
	
	}


}
