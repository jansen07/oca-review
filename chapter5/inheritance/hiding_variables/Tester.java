public class Tester{

	public static void main(String[] args){

		System.out.println("Animal m= new Lion()");
		Animal m = new Lion();
		m.printName(); // overide method. will print lion method -> Lion
		m.printWithStaticHide(); // static hidden. will exec. Animal Method -> Animal


		System.out.println("\n\n-----------------\n\n");

		System.out.println("Lion l = new Lion();");		
		Lion l= new Lion();
		l.printName(); // overide method. will print lion method -> Lion
		l.printWithStaticHide(); // static hidden. will exec. Animal Method -> lion



		System.out.println("\n\n-------------------\n\n");
		System.out.println("Animal pure= new Animal;");		
	
		Animal pure = new Animal();
		pure.printName();
		pure.printWithStaticHide();
	}
}
