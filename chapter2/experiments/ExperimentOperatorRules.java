public class ExperimentOperatorRules{


	/*
	 *  Numeric Promotion Rules
	 *  
	 *  1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
	 *  
	 *  2. If one of the values is integral and the other is floating-point, 
	 *  Java will automatically promote the integral value to the floating-point value’s data type.
	 *  
	 *  3. Smaller data types, namely byte , short , and char , are first promoted to int any 
	 *  time they’re used with a Java binary arithmetic operator, even if neither of the operands is int .
	 *
	 *  4. After all promotion has occurred and the operands have the same data type,
	 *  the resulting value will have the same data type as its promoted operands.
	 *
	 */
	 
	 


	public static void main(String[] args){
		rule1();
		rule2();
		rule3();
		float x=1;
		float y=2;
		float z= x + y;
		z=x*y;
		
		float z1= 2.1f * 3;
		double d= 2.1 * 3.4f;
		d=1 * 2.4f;
		long l=1+2;
		d=1* 3;
		d= 3L * 4;
		x= 3L * 1;	
		x= 4000L;

		short shrt=3;
		byte byt=5;
	//		short s=shrt + byt; lossy convertion, byte short and char performing operations will result to int
		int c = shrt+byt;
		float f= 30000000.233f * 20000000000000000.4f;

				
//		short imShort =  (short) shrt + (short) byt; // even if you cast it. it will still be promoted to int( rule 3 ) then ( rule 4 ) resulting value will have same datatype as its promoted operands


	}


	public static void rule1(){

		int num =1;
		long longNum = 23L;
		long imLong = num + longNum;
	}


	public static void rule2(){
		long longNum = 23;
		float floatNum= 1000F;
		float z = longNum * floatNum;
	}

	public static void rule3(){
		byte byteNum= 5;
		short shortNum = 2;
		int result = (short)byteNum * (short)shortNum; // both will be promoted to int first before the actual operation.
		short shortCast = (short) (byteNum * shortNum);
//		short shortResult = (short)byteNum * (short)shortNum; // compile time error lossy conversion

	}
}
