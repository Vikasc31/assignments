package assignments;
import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {

		double cel, fah, kel;
		Scanner scan;
        scan = new Scanner(System.in);
        
		System.out.println("Enter the temperature in celsius");
		
		cel = scan.nextFloat();
		
		fah = cel + 32;
		
		kel = cel + 273;
		
		System.out.println("Temperature in Fahrenheit = " + fah);
		System.out.println("Temperature in Kelvin = " + kel);

	}
}
