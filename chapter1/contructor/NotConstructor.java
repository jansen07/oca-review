public class NotConstructor{

// this is not a constructor! its a method
public void NotConstructor(){ System.out.println("I am not constructor");}
//this is a constructor
public NotConstructor(){ System.out.println("I am constructor");}


public static void main(String[] args){
NotConstructor n= new NotConstructor();
}

}
