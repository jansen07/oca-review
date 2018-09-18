public class ForLoop{

	public static void main(String[] args){
	
		//valid forloop
		int x=0;

		for(x=1;x<5;x++){
		System.out.println(x);
		}


		//  initialization ; booleanExpression ; updateStaement 
		for(int z=0;z<5;z++){
		System.out.println(z);
		}


		//this is also valid
		for(String s="test";s.equals("test");s="t"){
		
			System.out.println(s);
		
		}

		//this is also valid ->  multiple 
		int a=0;
		int z=1;
		for(z=0,x=1;a<3;a++,x++){
		System.out.println(a);
		}


		//this is also valid, even though initialization/booleanExpression/updateStatement doesn't have any effects		
		for(int j=0;a<10;z++){
		
			System.out.println("valid");
			break;
		}

	}

}
