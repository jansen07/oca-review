public class Test{

	{System.out.println("intatnce init");}
	static { System.out.println("static init");}
	
	public static void main(String[] args){
		new Test().Test();
		System.out.println("firstLine");
		{
			System.out.println("main method initialization");
		}

	
	}

	public void Test(){
		{System.out.println("Test Method"); }
	
	}


}
