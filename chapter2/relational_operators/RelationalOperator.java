public class RelationalOperator{

	public static void main(String[] args){
	
// relational operator is meant for primitive data types only
// ex. > < >= <=	

	int x=1;
	long l= 4;
	int z=2;

	long n=0;
	if( (n=(z=x)) >= l){
	System.out.println("z/x is greater than l");
	
	
	} else{
	System.out.println("lower");
	}

System.out.println(n);	
	}

}
