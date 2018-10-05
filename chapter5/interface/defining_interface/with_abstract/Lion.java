public class Lion implements AnimalInterface{
	
	public void printName(){
		System.out.println("Implementation of printName");
	}

	public static void main(String[] args){
		AnimalInterface m = new Lion();
		m.printName();
	
	}


}
