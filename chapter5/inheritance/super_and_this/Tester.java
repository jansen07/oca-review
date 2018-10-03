public class Tester{


	public static void main(String[] args){

		System.out.println("--------------\n\n");
		System.out.println("testing Lion lion = new Lion()");
		System.out.println();
		//
		Lion lion = new Lion("test"); // called Lion Constructor only
		

//		Lion parentLion = new Animal(); // animal can't be converted to lion
		System.out.println("\n\n----------\n\n");
		System.out.println("testing Animal animal= new Lion()");
		
		System.out.println();		
		Animal animal = new Lion("test"); // called Lion and Animal Constructor

	}

}
