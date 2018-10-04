public abstract class Abstract{
	public abstract void printName(){} // compile error : abstract method cannot have a body
	 
	public abstract void test(){ // compile error :  abstract method cannot have a body
		System.out.println("compile time error");
	
	}
}
