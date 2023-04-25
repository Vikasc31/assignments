package assignments;
import java.util.*;
public class LargeNumber {
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter any 3 integer value :");
		
		num1 = s1.nextInt();
		num2 = s1.nextInt();
		num3 = s1.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			
			System.out.println( "The largest number is " +num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println( "The largest number is " +num2);
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println( "The largest number is " +num3);
		}
		else 
		{
			System.out.println( "The numbers are same");
		}
			
	}

}
