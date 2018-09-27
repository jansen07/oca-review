public class StringBuilderTest{

	public static void main(String[] args){
	
	System.out.println("Hello String Builder");

	
	StringBuilder sb = new StringBuilder();
	System.out.println(sb);

	
	String s="test";

	sb.append(s);

	System.out.println(sb);
	System.out.println(s);

	System.out.println(s.equals(sb));
	System.out.println(sb.equals(s));
	System.out.println(s.equals(sb.toString()));

	System.out.println("1".equals(1));


	sb.insert(1,"xxx");
	print(sb.toString()); // prints txxxest

	sb.append("-appended");

	print(sb.toString());

	sb.deleteCharAt(1);
	print(sb.toString()); // prints txxest-appended

	sb.delete(1,3); // txxest -> first x is 1 -> 3 is e.  1,2 is the only deleted index
	print(sb);
	sb.delete(4,100); // doesn't throw out of bounds
	print(sb);


	StringBuilder testCapacity = new StringBuilder(" ");
	System.out.println("capacity: "+testCapacity.capacity() + " / length: "	 + testCapacity.length()); // capacity : 17, length 1
	}
	public static void print(StringBuilder sb){
		System.out.println(sb.toString());
	}

	public static void print(String x){
	
	System.out.println(x);
	}


	//Chapter 3 Question #5
	// compile time error. this does not compile. incomparable type
	public static void testCompare(){
		StringBuilder b=new StringBuilder("test");

		if(b == "test") System.out.println("it will compile");
	
	}
	//Chapter 3 Question #13
	// compile time error. String can't be converted to StringBuilder ( incomparable type )
	public static void testInstantiate(){
		StringBuilder instantiateFromString= "test";
	}




}
