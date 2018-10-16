public class Dog extends Animal{
	public void printDog(){
		System.out.println("Dog");
	}


	public static void main(String[] args){
	
		Animal m= new Animal();
		m.printAnimal();

		Dog d = (Dog) m;
		d.printDog();
	
	}

}
