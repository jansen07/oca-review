public class DefaultConstructor{
	//java will not Generate Constructor if it's declared, regardless of access modifier
	NoDefaultConstructor1 noDefCon = new NoDefaultConstructor1(); // compile time error

}

class NoDefaultConstructor1{
	
	private NoDefaultConstructor1(int x){
			
	}

}

