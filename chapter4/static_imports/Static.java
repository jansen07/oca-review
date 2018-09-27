import java.util.List;
import static java.util.Arrays.asList;

public class Static{
	
	public static void main(String[] args){
		List<String> list= asList(new String[1]); // we are in static method so we can call asList() freely
	//	list.add("test"); this will fail
	
	// * Remember that instantiating array with new initializes every array with null.
		
		System.out.println(list); // [null]
		list.set(0,"test"); 
		System.out.println(list); // [test]
		
		System.out.println("size "+list.size()); // print size and capacity | list doesn't have capacity method


		list.add("I will fail"); // we've declared a static list - fixed size
		System.out.println(list);
	
	}


}
