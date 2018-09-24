import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class ToArray{

	public static void main(String[] args){
		ArrayList<Integer> nmbrList = new ArrayList<>();

		nmbrList.add(4);
		nmbrList.add(6);
		nmbrList.add(20);	
		Object[] obj = nmbrList.toArray();
		Integer[] strArray=  nmbrList.toArray(new Integer[0]); // returns array with specific object, [0] zero means same size with list. or you can specify yours

			//what will happen if you instantiate with length less than actual?
		Integer  []testArray= nmbrList.toArray(new Integer[1]);	

		System.out.println(Arrays.toString(strArray));

		System.out.println(Arrays.toString(testArray));
		System.out.println(Arrays.toString(obj));	
		
		
		String[] x = {"4","2","3","5","1"};

		List<String> list = Arrays.asList(x);
		
		System.out.println(list);
		System.out.println(Arrays.toString(x));

		x[0]= "100";


		System.out.println(list); // 100,2,3,5,1
		System.out.println(Arrays.toString(x)); // 100,2,3,5,1

		list.remove("4"); //runtime exception, can't resize fixed list
		list.add("test"); //runtime exception, list is fixed size


		//if you have array of primitives, its hard to convert it to list. with .asList(new ???) like .asList(new String[0]) because int is primitive and not object
	}


}
