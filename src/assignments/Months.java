package assignments;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		
		int month, days = 0;
		
		String monthname = "";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the month :");
		
		month = s1.nextInt();
		
		switch (month) {
		
		case 1:
			
			monthname = "January";
			days = 31;
			break;
			
		case 2:
			
			monthname = "February";
			days = 28;
			break;
			
		case 3:
			
			monthname = "march";
			days = 31;
			break;
			
		case 4:
			
			monthname = "April";
			days = 30;
			break;
			
		case 5:
			
			monthname = "May";
			days = 31;
			break;
			
		case 6:
			
			monthname = "June";
			days = 30;
			break;
			
		case 7:
			
			monthname = "July";
			days = 31;
			break;
			
		case 8:
			
			monthname = "August";
			days = 31;
			break;
			
		case 9:
			
			monthname = "September";
			days = 30;
			break;
			
		case 10:
			
			monthname = "October";
			days = 31;
			break;
			
		case 11:
	
			monthname = "November";
			days = 30;
			break;
			
		case 12:
			
			monthname = "December";
			days = 31;

		}
		
		System.out.println(month+"th month has " +days+" days");
	}
}
