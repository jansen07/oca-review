public class Sample1{

public static void main(String[] args){
int x=3;
double y=2;
int z=2;
float a=2f;
System.out.println((int)(x/y));
//results to int

System.out.println((int)x/y);
//results to double. y is double it cast was given to x only

//valid
double test= x/a;

//this is a lossy converstion , y is double which will result to failure
//float testFloat= x/y;

// another lossy conversion, x was casted to float but y is double. not casted results to double
//float testFloatCast = (float)x/y;


}
}
