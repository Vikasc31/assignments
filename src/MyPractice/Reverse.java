import java.util.*;

public class Reverse {

	public static void main(String arg[])
	{
		int a, rem, temp = 0;	

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number :");

		a = scan.nextInt();

		while( a > 0)
		{

			rem = a % 10;

			temp = (temp * 10) + rem; 

			a = a / 10;
		}

		System.out.println("Reverse = " +temp);
	
	}
}