public class Test implements First{
	
	public static void main(String[] args){
		First.printName();

		printName();// compiler error. interface static methods is not inherited	
	}

}
