public class Tester{

	public static void main(String[] args){
		Lion l= new Lion();
		System.out.println(l.age);
		System.out.println(l.name);
		System.out.println(l.getParentName());
		System.out.println(l.birthDate);
		l.animalMethod();
		l.lionMethod();
		/* 
		 * prints
		 *
		 * 50
		 * lion
		 * animal
		 * 12-16-1993
		 * I'm animal Method
		 * I'm lion Method
		 */

		System.out.println("-------------------");
		Animal m= new Lion();
		m.birthDate="test";
		System.out.println(m.birthDate);
		m.animalMethod();
//		m.lionMethod(); this is not valid. parent object can't access child methods/members
		System.out.println(m.age);
		System.out.println(m.name);

		/*
		 * prints
		 *
		 * test
		 * I'm animal Method
		 * 100
		 * animal
		 */ 
	}



}
