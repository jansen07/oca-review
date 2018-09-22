import java.util.*;

public class EmptyBraces{


	public static void main(String[] args){
	

		EmptyBraces br= new EmptyBraces();
		br.printHello();

		int[][][][][] x = new int[1][1][2][3][5];
int counter=0;
		for(int[][][][] y: x){
			for(int z[][][] : y){
				for(int a[][] : z){
					for(int b[] : a){
						for(int c: b){
							counter++;
						
						}
					
					}
				
				}
			
			}
		
		}

		System.out.println(Arrays.toString(x));

		System.out.println(counter);
	}

	default void sayHello(){}

	final void sayHi(){}
	static final void hey(){}
	public void printHello(){}

}
