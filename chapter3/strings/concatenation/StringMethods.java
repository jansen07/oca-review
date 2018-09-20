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
	 *
	 */

	public static void main(String[] args){
	String name="animals";

	System.out.println(	name.charAt(0));
		
	
	System.out.println(name.length());
		
	//returns 4. second a is at index 4	
	System.out.println(name.indexOf('a',4));
		

	System.out.println(name.indexOf('a',5)); // returns -1 , index 5 is l
	
	System.out.println(name.substring(1,4)); // 1 - n  4 - a prints nim

	System.out.println(name.toLowerCase());

	System.out.println(name.toUpperCase()); 
	
	String name2="animAls";
	String name3= new String("animals");

	System.out.println(name.equalsIgnoreCase(name2));
	
	System.out.println(name.equals(name3));
	
	//startsWith() , endsWith()
	System.out.println(name.startsWith("ni")); // false
	System.out.println(name.endsWith("als")); //true

	//contains() , trim()
	
	System.out.println(name.contains("im"));

	System.out.println("  test   ");
	System.out.println("  test   ".trim());
		

	}	



}
