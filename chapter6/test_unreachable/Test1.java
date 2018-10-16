public class Test1{

	
	public static void main(String[] args){
	
	try{
		System.out.println("Test");
		test();
		System.out.println("I may not be reached"); // this is valid even though the method test only do is throw exception
	}catch(Exception e){
		System.out.println("catching");	
	}

	//test direct throw
	
	try{
	
		System.out.println("Test");
		throw new Exception();
		System.out.println("I may not be reached"); // compile time error Unreachable Statement
	}catch(Exception e){
		System.out.println("catching");
	}
	
	}


	public static void test()throws Exception{
		throw new Exception();	
	}

}
