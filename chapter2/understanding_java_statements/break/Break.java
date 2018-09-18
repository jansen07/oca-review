public class Break{


	//String starts with capital letter
public static void main(String[] args){
//break statement transfers the flow of control out to the enclosing statement

	for(int i=0;i<3;i++){
	
	System.out.println("i: "+i);
	if(i==1)
		//continue -> does not execute the remaining statements and proceed to next iteration
		continue;
		for(int j=0;j<5;j++){
			//if j is 3 it breaks out for the first loop. j		
			if(j==3) break;

			System.out.println("  j:"+j);
		}
	
	}

}

}
