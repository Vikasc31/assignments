package assignments;
import java.util.*;
public class Arithmetic5 {
	
	public static void main(String arg[]) {
		
		int a, b, sum, diff, prod, avg, max, min;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a :");
		
		a = scan.nextInt();
		
		System.out.println("Enter value of b :");
		
		b = scan.nextInt();
		
		sum = a + b;
		System.out.println("\n Sum " +sum);
		
		diff = a - b;
		System.out.println("\n Difference " +diff);
		
		prod =  a * b;
		System.out.println("\n Product " +prod);
		
		avg = sum/2;
		System.out.println("\n Average " +avg);
		
		max =  Math.max(a, b);
		System.out.println("\n Maximum " +max);
		
		min = Math.min(a, b);
		System.out.println("\n Minimum " +min);
	}

}
