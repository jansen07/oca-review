public final abstract class Abstract{ // compile error
	public abstract void printName(){} // compile error : abstract method cannot have a body
	 
	public abstract void test(){ // compile error :  abstract method cannot have a body
		System.out.println("compile time error");
	
	}

	public final abstract void finalAbstract(); //compile error abstract and final 

	public final void finalConcrete(){ // this is good
	}

	private abstract void privateAbstract(); // compile error. abstract class should be implemented. that's why it can't be abstract and private
}
