public class Animal{
	public static void printName(){
		System.out.println("Animal Method");
	}

	public void printAnimalMethod(){
		printName(); // this will call the Animal method since it's static hidden method. not overridden by Lion method
	}
}
