public class Test{

	public static void main(String[] args) throws Exception{
	
		Animal m= new Dog();

//		m.printName();// unexpected exception

		((Dog)m).printName(); // prints Dog Method
	
	}

}
