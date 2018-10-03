public class Animal{

	private int age;
	private  Animal(){
		//you can't call both super and this in single constructor
//		super(); both super() and this() can only be called on the first statement. this can't be merged
		this(4);
		System.out.println("end of Animal() constructor");
	}
	public Animal(int age){
		this.age=age;
		System.out.println("called Animal(int age) constructor");
	}
}
