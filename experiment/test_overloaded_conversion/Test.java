public class Test{
	int id=1;

	public static void main(String[] args){
		Test test= new Test();
		test.id=5;
		System.out.println(test.id);
		Test der=dereference(test);
		System.out.println(test.id);
		System.out.println(der.id);
	}
	public void test(Float f){
		System.out.println("Float");
	}

	public static Test dereference(Test t){
	t=null;
	t= new Test();
	t.id=100;
	return t;
	}
}
