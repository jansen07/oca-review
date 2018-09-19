public class Immutability{

	/*
	 * Remember: String are immutable. 
	 * methods manipulation will return new string object 
	 * and will not be automatically changed
	 *
	 */
	public static void main(String[] args){
	
		String s1="1";
		String s2= s1.concat("2");

		s2.concat("3");
		
		System.out.println(s2); // prints "12"


	
	}


}
