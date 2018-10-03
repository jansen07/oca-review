//compile time error recursive constructor invocation
public class Unlimited{

	public Unlimited(){
	//remember java will insert super() here as default
	} 
	public Unlimited(int age){
		this("test");
	
	}
	public Unlimited(String name){
		this(1);
	}

}
