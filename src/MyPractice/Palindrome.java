import java.util.*;

public class Palindrome {

	public static void main(String arg[])
	{
		int a, b, rem, temp = 0;	

		Scanner scan = new Scanner(System.in);
 
		System.out.println("Enter the number :");

		a = scan.nextInt();
		
		b = a;

		while( a > 0)
		{

			rem = a % 10;

			temp = (temp * 10) + rem; 

			a = a / 10;
		}

		System.out.println("Reverse = " +temp);

		if (temp == b )
		{
			System.out.println("The given number is Palindrome");
		}
		else
		{
			System.out.println("The given number is not Palindrome");
		}
		
	
	}
}