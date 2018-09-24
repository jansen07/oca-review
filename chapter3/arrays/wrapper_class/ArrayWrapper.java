import java.util.*;
public class ArrayWrapper{
	public static void main(String[] args){
	
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(new Integer(1));
		numbers.add(3);// this is called autoboxing

		numbers.add(9);
		numbers.add(2);
		numbers.remove(0);//prints 3,9,2		
		print(numbers);
		numbers.remove(new Integer(9)); // to remove value 9 use the wrapper class
		print(numbers);


		numbers.add(null);

		print(numbers);
//		int y= null; this is compile time error
//		int x = numbers.get(2); // numbers.get returns null. null was tried to get converted into int. which leads to null pointer exception
		
		ArrayList<Double> d= new ArrayList<>();
		
		d.add(3D);
		d.add(3.50);
		d.add(40.23); // 3.0, 3.5, 40.23
		print(d);
		d.remove(40.23); 
		print(d);	//3.0 , 3.5
		d.remove(3D);
		print(d); // 3.5
	}

	public static void print(ArrayList list){
		System.out.println(list);
	
	}


}
