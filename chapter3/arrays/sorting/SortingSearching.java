import java.util.Arrays;

public class SortingSearching{


	public static void main(String[] args){
		int[] numbers={5,2,4,2,1};
		Arrays.sort(numbers); // Arrays.sort() is void
		System.out.println(Arrays.toString(numbers));

		print(2,numbers);			
		print(4,numbers);	
	
	}

	public static void print(int n, int[] numbers){
	System.out.println(Arrays.binarySearch(numbers,n));
	
	}

}
