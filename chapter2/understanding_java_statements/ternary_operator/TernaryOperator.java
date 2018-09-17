public class TernaryOperator{

public static void main(String[] args){

	int x=1,z=1;

	int f= (x>1) ? x++ : z++;

	System.out.println("x: "+x + " z: "+z);

	// this will not compile , the 2nd and 3rd operand expects holder of returned statement
	1>2 ? x++ : z++;


	System.out.println("x: "+x + " z: "+z);
}

}
