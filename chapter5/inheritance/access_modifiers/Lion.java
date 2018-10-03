public class Lion extends Animal{
	public String name;
	public int age;

	public Lion(){
		super.age=100;
		age=50;
		this.name="lion";
	}
	public String getParentName(){
		return super.name;
	
	}

	public void lionMethod(){
		System.out.println("I'm lion Method");
	}



}
