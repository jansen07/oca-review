public class EnhanceForLoop{

	public static void main(String[] args){
	
	
		/*
		 * bewary of this declaration, 
		 * String names = new String[5]  
		 * 
		 * names here is not array, incompatible types
		 *
		 */

		//though the String is null, it will print null		
		String[] names= new String[5];
		for(String name: names){
		
			System.out.println(name);
		}


		// exam watch 
		String[] lastNames = new String[5];

		for(int lastName:lastName){
			System.out.println(lastName);
		}//will not compile due to incompatible types, int <- String
	
	}

}
