public class ExperimentIncrement{

	/**
	 *
	 * this produces infinite loop.
	 * i = i++ will not increment.
	 * returns same value before incrementing
	 *
	 *
	 *
	 */
	public static void main(String[] args){
	
		for(int i=0;i<10;){
		
			i = i++;
		System.out.println(i);
		
		}
	
	}

}
