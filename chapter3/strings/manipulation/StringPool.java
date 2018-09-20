public class StringPool{


	public static void main(String[] args){
	
		String x= "Hello"; //punched to Stringpool
		String y= new String("Hello"); // No JVM! create new object

		String z= "Hello";
		if(x!=y){
		System.out.println("x is not equal to y");
		}

		if(x == z){
		System.out.println("we are both from string pool");
		}

	
	
	}


}
