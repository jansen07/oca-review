public class Animal{

	private static String name = "Animal";

	public void printName(){
		System.out.println("AnimalOverideMethod: name: "+name);
	}
	public static void printWithStaticHide(){
		System.out.println("AnimalStaticHide : name: "+name);
	
	}
}
