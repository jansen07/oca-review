public class IncrementDecrementOperators{

	private static int x=3;
public static void main(String[] args){

	int y= ++x * 5 / x-- + --x;

	//x = 3
	// PEMDMAS
	// ++x           x--              --x
	// 4    * 5   /   4        +       2
	// inc= 4       declater-> 3   decNow -> 2
	// 20 / 4 + 2
	// 5 + 2
	// 7
System.out.println("x is " + x);
System.out.println("y is " + y);

}

}
