public class ReferenceByString{

public static void main(String[] args){

String str="Hello String";
System.out.println(str);
alterString(str);
System.out.println(str);
}

//important! static main calls static only
public static void alterString(String x){
x="string is altered";

System.out.println(x);
}

}
