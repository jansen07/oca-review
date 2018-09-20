public class PrimitiveInt{

	public static void main(String[] args){
	
		int[] numbers= new int[5];

		for(int number: numbers){
		   System.out.println(number);
		
		}
		int x;	// not initialized but valid	
		System.out.println(x);// compile error line 12. invalid
	}


}
