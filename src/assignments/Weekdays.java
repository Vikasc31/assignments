package assignments;
import java.util.*;
public class Weekdays {

	public static void main(String[] args) {
	
		int num;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of day: ");
		
		num = s.nextInt();
		
		if(num == 1) 
		{
			System.out.println("Monday");
		}
		else if(num == 2)
		{
			System.out.println("Tuesday");
		}
		else if(num == 3)
		{
			System.out.println("Wednesday");
		}	
		else if(num == 4)
		{
			System.out.println("Thursday");
		}
		else if(num == 5)
		{
			System.out.println("Friday");
		}
		else if(num == 6)
		{
			System.out.println("Saturday");
		}
		else if(num == 7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Input! Please enter the value in between 1-7 ");
		}
}
}
