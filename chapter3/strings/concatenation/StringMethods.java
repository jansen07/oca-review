public class StringMethods{

	/*
	 *
	 * index starts at 0
	 * .length() method counts chartacters. hello = 5
	 * 
	 * charAt(1) returns char @Specific index
	 * throws indexOutOfBounds
	 * 
	 * indexOf returns first index of matched char
	 * -1 if not found
	 * indexOf(char c)
	 * indexOf(char c,index fromIndex)
	 * indexOf(String s)
	 * indexOf(String s,index fromIndex)
	 *
	 * substring() returns String
	 * notice String is not capital letter
	 * 
	 */

	public static void main(String[] args){
	String name="animals";

	System.out.println(	name.charAt(0));
		
	
	System.out.println(name.length());
		
	//returns 4. second a is at index 4	
	System.out.println(name.indexOf('a',4));
		

	System.out.println(name.indexOf('a',5)); // returns -1 , index 5 is l
	

		
	}	



}
