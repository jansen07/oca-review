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

	
	int z=1;
	int a=0;

	a=z++;
// a = 1, z =2
	System.out.println("a: "+a+ " z:"+z);


	a = --z;
// a =1 z=1

	System.out.println("a: "+a+ " z:"+z);
	
	a= ++z;

	// a = 2 z=2
	System.out.println("a: "+a+ " z:"+z);


	x=1;
	z=1;

	x = z++ + z++;
//	x = z= z+1  + z = z+
	//    z 1    +  z=2
	//    z = 3
	//    x = 3
	System.out.println("x: "+x+ " z:"+z);


	x=2;
	z=1;
	x = z++ + z++ + x;
	//   1     2    2
	//   x =  5  z = 3
	//   amazing right?
	System.out.println("x: "+x+ " z:"+z);
}

}

