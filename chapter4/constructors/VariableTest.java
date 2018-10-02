public class VariableTest{

	String name;
	
	public static void main(String[] args){
		VariableTest test= new VariableTest();
		test.testVar("jansen");
		test.testLocalVar();	
	}

	public void testVar(String name){
		this.name="name: "+name;
		System.out.println(this.name);
	}

	public void testLocalVar(){
		String name="hehe";
		System.out.println(name);
	
	}

	public void varScope(){
		String name = "test";
			
			try{
				String name = "haha"; // compile time error
			
			}catch(Exception e){
			
				return;
			}
	
	}
}
