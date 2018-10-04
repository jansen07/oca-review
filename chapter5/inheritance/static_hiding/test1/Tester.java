public class Tester{
	public static void main(String[] args){
		Lion l = new Lion(); 
		l.printAnimalMethod(); // prints animal method
		l.printLionMethod(); // prints lion method

		System.out.println("----------------------");
		Animal m= new Lion();
		m.printAnimalMethod(); // prints animal method
//		m.printLionMethod(); not accesible if Animal object is created

		Animal m1 = new Animal();
		m1.printAnimalMethod(); // prints animal method
	}

}
