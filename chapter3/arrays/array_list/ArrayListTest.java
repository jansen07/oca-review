import java.util.ArrayList;
import java.util.List;
public class ArrayListTest{
	/* 
	 * There are three ways to create ArrayList
	 * check line 10
	 * 
	 */
	public static void main(String[] args){
		ArrayList list= new ArrayList();
		ArrayList list2 = new ArrayList(10);
		// ArrayList list3 = new ArrayList(list2);


		ArrayList<String> strArrayListJava7	= new ArrayList<>();

		List<String> list4 = new ArrayList<>(); //List can be instantiated

		List list5 = new ArrayList();

		list.add("hello");
		list.add(true);
		list.add(3.5);
		list.add(4.4F);
		System.out.println(list);
		
		list4.add("hawk");
		list4.add(1,"robin"); // you can only pass/assign first param same as list4 length()
		System.out.println(list4);
		System.out.println(list4.size()); // ArrayList doesn't have length() ->it's size. remember that array have .length because size is constant. its final variable
		ArrayList<String> strArrayList	= new ArrayList<String>();

		strArrayList.add("str");
//		strArrayList.add(true); argument mismatch

		ArrayList<String> birds = new ArrayList<>();

		birds.add(0,"ibon");
		birds.add(1,"parot");
		birds.add(1,"kosta");//ibon kosta parot
		birds.add(3,"last"); //ibon kosta parot last
		System.out.println(birds);
		birds.remove(3); // ibon kosta parot
		System.out.println(birds);
		birds.remove("kosta");// remove by object// ibon parot	
		System.out.println(birds);

		birds.set(0,"agila"); // replace objects on specific index
		System.out.println(birds);


		System.out.println(birds.isEmpty());
		System.out.println(birds.size());


		birds.clear();

		System.out.println(birds.isEmpty());
		System.out.println(birds.size());

		birds.add("kosta");
		System.out.println(birds.contains(new String("kosta")));// true

		ArrayList<String> bords = new ArrayList<>();
		bords.add("kosta");
		System.out.println(bords.equals(birds));// true
		
	}


}
