public class Lion extends Animal{
	
	public Lion(){
		this(100);
	}
	public Lion(int age){
		//super -> will be automatically inserted if not present. super() if super() is not available or private. it will not compile
		super(1);
		System.out.println("initializing Lion Constructor begin (int age)");
	}
	public Lion(String name){
		super(100);
	}
}
