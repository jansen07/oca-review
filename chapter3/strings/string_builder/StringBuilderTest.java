public class StringBuilderTest{

	public static void main(String[] args){
	
	System.out.println("Hello String Builder");
	

	
	StringBuilder sb = new StringBuilder();
	System.out.println(sb);

	
	String s="test";

	sb.append(s);

	System.out.println(sb);
	System.out.println(s);

	System.out.println(s.equals(sb));
	System.out.println(sb.equals(s));
	System.out.println(s.equals(sb.toString()));

	System.out.println("1".equals(1));
	}


}
