public class CallThis{

	public CallThis(){
		CallThis();	
	}

	public void CallThis(){ //this is a method
		System.out.println("method CallThis() is called ");
	}

	public static void main(String[] args){
		new CallThis();
	}

}
