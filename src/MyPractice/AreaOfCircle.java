import java.util.*;
public class AreaOfCircle {

	public static void main (String arg[])
	{

		double r, area, n = 3.14159;

		Scanner scan;
	
		scan = new Scanner(System.in);

		System.out.println("Enter the radius of circle :");

		r = scan.nextDouble();

		area = n * r * r;

		System.out.println("The area of circle is :" + area);

		
	}
}