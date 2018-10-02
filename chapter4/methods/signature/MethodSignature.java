import java.util.*;

public class MethodSignature{

	public static void main(String[] args){
	
	}


	public String getName(String name){
		return null;
	}

	//the return type is not part of the signature
	public List<String> getName(String name){
		return null;
	}

	// the parameter name is not part of the signature
	public String getName(String s){
		return null;
	}

	// access modifier is not part of method signature
	private String getName(String name){
		return null;	
	}


}
