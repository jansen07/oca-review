public class Tester{

	public static void main(String[] args){
	
		Animal m= new Lion(); 
		m.printName(); // prints animal method(hidden) -> if this is non static this will print the lion method(overriden)
 

		Lion l = new Lion();

		l.printName(); // prints Lion Method

//		Lion.printName(); // prints Lion Method
//		Animal.printName(); // prints Lion Method
	}

}
