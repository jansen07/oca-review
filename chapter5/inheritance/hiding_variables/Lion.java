public class Lion extends Animal{

	private static String name="Lion";
	public void printName(){
		System.out.println("LionPrintName() : name:" + name);
	}

	public static void printWithStaticHide(){
		System.out.println("LionStaticHide: name:" + name);
	}
}
