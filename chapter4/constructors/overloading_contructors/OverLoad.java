public class OverLoad{

	public OverLoad(float f,long l){
	System.out.println(f);
	System.out.println(l);	
	}
	public OverLoad(Integer i, String s){
		System.out.println(i);
		System.out.println(s);
	
	}
	public static void main(String args[]){
	
		OverLoad ov = new OverLoad(2,3);
		OverLoad ov1 = new OverLoad(2,"test");
	}
	


}
