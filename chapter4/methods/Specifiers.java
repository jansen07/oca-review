public class Specifiers{
	public static void main(String[] args){
		
		Specifiers sp = new Specifiers();
		sp.printName();
	}


	private static String name;

	/*
	 *
	 * Specifiers are optinal
	 * static , abstract , final     - OCA
	 * synchronized                  - OCP
	 * native,strictfp               - not in OCA/OCP
	 *
	 * static - class methods
	 * abstract - no body
	 * final - method not allowed to be overridden by subclass
	 */


	// always remember that static method can only access static variables
	public static void printName(){
		System.out.println(name); // prints null -> initialized upon object creation
		cantBeOveride();
	}
	
	public static final void cantBeOveride(){
		System.out.println("I am final");
	}

	public final static void testing(){
	
	}
	
}


abstract class Animal{

	protected abstract void walk(); // abstract method don't have body and can't be private
	protected abstract void testing(); // abstract and static/final can't be combined
}
