import java.util.*;
public class Sum2 {

	public static void main (String arg[])
	{
	
		int a, b, c, sum;

		Scanner scan;

		scan = new Scanner(System.in);

		System.out.println("Enter any 3 value :");

		a = scan.nextInt();

		b = scan.nextInt();

		c = scan.nextInt();

		sum = a + b + c;

		System.out.println("Sum = " + sum);
	}
}