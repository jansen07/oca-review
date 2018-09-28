//import java.util.Arrays; -> compilation Error
import java.util.*;
public class Arrays{

	public static void main(String[] args){
	
		Arrays array= new Arrays(); // this is this.class not the util.Arrays
		java.util.Arrays ar= new java.util.Arrays(); // compile error. Arrays have private constructor
	}

}
