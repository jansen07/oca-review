public class TestCatch{

	public static void main(String[] args){
		

		try{
			System.out.println("Before Exception");
			throw new Exception();
			System.out.println("This will not be executed"); // compile time error. unreachable statement
		
		}catch(Exception e){
			System.out.println("Gotcha");
		
		}
		
			throw new RuntimeException();// runtime exception
		
		
	
	}
	

}
