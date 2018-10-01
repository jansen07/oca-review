public class OverLoadingMethod{

	public static void main(String... args){
		OverLoadingMethod ov=new OverLoadingMethod();

		ov.test(1F,2);
		ov.test(1,2F);
		ov.test(1,2);
	
	}

/*	commented out to test Method Overloading hierarchy	
	public void test(int i,int j){
		System.out.println("firstMethod/"+i+" : "+j); 
	}*/
	public void test(float i,int j){
		System.out.println("float/int");		
	}

	public void test(int i,float j){
		System.out.println("int/float"); 
	}
	
/*	commented out to test Method Overloading hierarchy	
	public void test(int i,long j){
		System.out.println("int/long");	
	
	}*/
	public void test(float i,float j){
		System.out.println("float/float");
	}
}
