import java.time.*;
public class DateTimeTest{
	public static void main(String[] args){
		
		print(LocalDate.now());
		print(LocalTime.now());
		print(LocalDateTime.now());

		LocalDate date= LocalDate.now();
		date.plusWeeks(1); // this returns object. so you have to reassign it to date
		print(date);
		date=date.plusWeeks(1);
		print(date);
		LocalDate date1= date.plusDays(2);
		print(date1);
	
	}
	public static void print(Object obj){
		System.out.println(obj);
	}

}
