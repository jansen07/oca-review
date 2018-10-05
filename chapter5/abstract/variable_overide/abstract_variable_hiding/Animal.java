public abstract class Animal{
	
	public String name="Animal";

	protected String lowerAccess;

	protected void printName(){
		System.out.println(name);
	
	}

	// behaves almost like a normal class. when hiding variable is implemented.you just can't instantiate it
	public static void main(String[] args){
		Animal m= new Lion();
		m.printName();  // print lion
		System.out.println(m.name); // print animal -> m is animal object. m.name references to animal

		Lion l= new Lion();
		l.printName(); // print lion
		System.out.println(	l.name); // print lion

	
	}
}
