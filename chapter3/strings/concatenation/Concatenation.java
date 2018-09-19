public class Concatenation{

	/*
	 * 1. If both operands are numeric, + means addition.
	 * 2. If either operand is a String, + means concatenation.
	 * 3. The Expression is evaluated from left to right.
	 */
	public static void main(String[] args){
	
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); //ab
		System.out.println(1 + "a" + 2 + "b"); // 1a2b
		System.out.println(1 + 2 + "3" + 4 + 5); //3345
	
		System.out.println(1 + 2 + "3" + (4 + 5)); //339
	}


}
