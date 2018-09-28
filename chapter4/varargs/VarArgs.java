public class VarArgs{
	public static void main(String[] args){
		Printer.print("Jansen","Novare","DJames","kenneth");
		Printer.test(1,4,"Jansen","Goyena");
		Printer.testInt(null);
	}
}

class Printer{
	public static void print(String... names){
		for(String name:names)
			System.out.println(name);
	}


	public static void test(int x,float y,String... names){
		System.out.println("----------------------");
		System.out.println("length: "+names.length);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("*****************");


		for(String name:names)
			System.out.println(name);
			System.out.println("--------------------------");
	}

	public static void testInt(int... num){
		System.out.println(num.length); // NullPointer Exception	
	}
}
