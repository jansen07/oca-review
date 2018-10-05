public class Lion extends Animal{
	
	public void printName(){ // this is the implemented method , if this is not here. it will not compile
		System.out.println(name);
	}

	public static void main(String[] args){
		Lion l= new Lion();
		l.printName(); // calls childs implemented method
		l.printPrivateVar(); // calls parent's concrete method
		l.testOverride(); // calls Lion's overridden method		
	}
	public void testOverride(){ // public is valid because it's broader than the abstract class
		super.testOverride(); // call the parent
		System.out.println("Lion's overidden method"); 
	}

}
