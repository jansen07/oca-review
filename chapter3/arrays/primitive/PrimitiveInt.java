public class PrimitiveInt{

	public static void main(String[] args){
	
		int[] numbers= new int[5];

		for(int number: numbers){
		   System.out.println(number);
		
		}
		int x=0;	//if not initialized and used will throw compile error	
		System.out.println(x);// compile error line 12. invalid

		//this are all valid array declaration
		
		int [] a = new int[2];
		int  b[] = new int[3];
		int c []; // new [2]int; doesn't work and same with new int[] without number
	}


}
