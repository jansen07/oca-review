import java.time.*;
public class DateTimeTest{
	public static void main(String[] args){
		
		print(LocalDate.now());
		print(LocalTime.now());
		print(LocalDateTime.now());
	
	}
	public static void print(Object obj){
		System.out.println(obj);
	}

}
