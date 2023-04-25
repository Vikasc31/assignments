package assignments;
import java.util.*;
public class Positive {

	public static void main(String[] args) {
		
		int num;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		
		num = s1.nextInt();
		
		if (num > 0) 
		{
			System.out.println("The number is positive");
		}
		else if (num < 0) 
		{
			System.out.println("The number is negative");
		}
		else 
		{
			System.out.println("The number is zero");
		}
	}
}
