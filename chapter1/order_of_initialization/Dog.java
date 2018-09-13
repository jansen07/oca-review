/**
 *REMEMBER: Field and Instance initializer first then constructor
 *
 *

public class Dog{

//note that Doggy variable was instantiated first that's why System.out.prinln can be called
//if var "name" is declared below instance initializer it will not compile
String name="Doggy";

{System.out.println("instance initializer: dogname:"+name);name="modified doggy"; }

{System.out.println("second instance initializer: dogname:"+name); }

public static void main(String[] args){
Dog d=new Dog();
}

}
