public class AsymetricArray{
	/*
	 * This Exercise shows that you can initialize array into different sizes
	 *
	 */
	public static void main(String... args){
		
//this is invalid String[4][] x;
	
		String[][] x;
		x = new String [4][];// initialize the first row of size 4 and each row we can initialize different sizes.

		x[0] = new String[5]; 
		x[1] = new String[4];
		x[0] = new String[9];// you can re initialize arrays, remember that its just a reference that you can point to

//		x[0] = new int[4]; this wont compile. its expecting it to be []String
		System.out.println(x[0].length); // arrays are immutable, that's why they don't have method to access the length. like .length() it's final public field
		System.out.println(x[1].length);

	//	String s=x[2][0]; throws null pointer , its not yet initialized
	//	x[2][0]="hello"; throws null pointer also
		String s=x[0][1]=x[0][2]="test"; // this is valid. evaluating from left to right and assigning it finally to String s
		System.out.println(s);
		for(String y[]: x){
			for(String z:y){ // will throw null pointer exception. 
				System.out.println(z);
			}
		
		}

	}


}
