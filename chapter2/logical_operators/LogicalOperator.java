public class LogicalOperator{

public static void main(String[] args){
int x=1;
//this is valid
if(x>=1 && ((x=5)>2)){
   System.out.println("passed: the value of x is:"+ x);
}
//you can't declare variable inside expression
String s;
if((s="this") == "this"){
System.out.println("this is valid");

}

}
}
