public abstract class Animal{

	protected String name= "Animal"; // if this is private. make sure to add setter/getter to access the value
	private String privateAnimalVar="I'm Animal's private variable";
	public abstract void printName();


	protected void printPrivateVar(){
		System.out.println(privateAnimalVar);
	}

	protected void testOverride(){
		System.out.println("Animal method to be overridden");
	}

}
