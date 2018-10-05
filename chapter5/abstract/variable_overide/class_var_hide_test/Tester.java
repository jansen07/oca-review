public class Tester{

	public static void main(String[] args){
		Animal m = new Animal();

		System.out.println("--------------");	
		System.out.println("Animal m = new Animal()");
		
		System.out.println(m.name); // print Animal
		m.printName(); // print Animal Method 

		
		System.out.println("--------------");	
		System.out.println("Animal ml = new Lion()");
		Animal ml= new Lion();	
		System.out.println(ml.name); // print Animal var
		ml.printName(); // print Lion method and Lion name Var
		
		System.out.println("--------------");	
		Lion l = new Lion();
		System.out.println("Lion l = new Lion()");
		System.out.println(l.name); // print Lion
		l.printName(); // print Lion method with Lion name Var
	}

}
