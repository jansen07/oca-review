public class EqualityOperator{

	public static void main(String[] args){
	

		// -> == != 
		// 1. comparing 2 NUMERIC primitive
		// 2. comparing 2 boolean values
		// 3. comparing 2 objects including null and string

		boolean z=false;
		boolean y = z=true; //valid statement z returns true
		
		System.out.println("z: "+ z + " y: "+y);

		//lets check with if statement
		//

		if(y==(z=false)){
		System.out.println("y is false");


		
		

		}
		int x=1;

String s=null;
		//this prints "false"  -> concats null with ??: first then compared to null
		System.out.println("??:  " + null == null);


		//left to right. concat first then concat all
		// prints 25
		System.out.println("??: " + 2 + 5);


		// return x
		System.out.println(testGet());

		// assignment returns 5. so 5+2 = 7, then concat string with 7
		// prints 7
		System.out.println("??: " + (2+ (x=5)));



		
		//
/*
 * this will not compile, incomparable types boolean and int
 * 
 * numeric to numeric only , checkout rule#1
 *	
 * boolean isValid= (1 == true);
 *
 * 
 */
	}
	//this doesn't just assign. also returns value
	public static int testGet(){
		int x=0;
		return x=5;
	}

}
