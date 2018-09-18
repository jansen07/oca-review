public class AssignmentOperator{
public static void main(String[] args){
short testShort=10;
short testMulShort = testShort*2;
	int x = 1.0; //DOES NOT COMPILE
short y= 1921222; //DOES NOT COMPILE
int z= 9f; //DOES NOT COMPILE
long l= 123456; // DOES NOT COMPILE
float f= 1.0; // DOES NOT COMPILE
float f1= 1; //THIS COMPILES int -> float
//REMEMBER
//adding .0 decimal instructs compiler to treat value as double


short a=1;
short b=3;

short c=a+b; // DOES NOT COMPILE
short c=a * b; // DOES NOT COMPILE

}

}
