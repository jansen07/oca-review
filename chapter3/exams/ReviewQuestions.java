public class ReviewQuestions{

	public static void main(String args[]){
	
		ReviewQuestions q=new ReviewQuestions();
		q.stringInstantiation();	
	
	}

	// #1 TRICKY can't convert int to String
	public void stringInstantiation(){
		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = numFish + 1; // compile time error

		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);	
	}



}
