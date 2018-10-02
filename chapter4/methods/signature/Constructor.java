public class Constructor{
	
static	String name;
static	int length;
public final String finalName;

public static final String staticFinalName;

static{

	staticFinalName = "I'm a static final. I can be initialized here or in instance variable";
}
	public void Constructor(){} // I'm a method. WATCH Return type
	//this is a method. constructor doesn't have return type
	public Constructor(){ // constructor can't have modifiers like static/final
		finalName="test";
		//final can be initialized in constructor
		this.name = "testStatic";
		//static variables can't be initialized here

	}

	public static void main(String[] args){
	
		System.out.println(new Constructor().finalName);
	}



}
