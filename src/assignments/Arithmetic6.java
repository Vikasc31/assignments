package assignments;
import java.util.*;
public class Arithmetic6 {
	
	public static void main(String arg[]) {
		
		int a, sq, cu, pow;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value :");
		
		a = s1.nextInt();
		
		sq = a * a;
		
		cu = a * a * a;
		
		pow = (int) Math.pow(a, 4);
		
		System.out.println("\n Square : " +sq);
		System.out.println("\n Cube : " +cu);
		System.out.println("\n 4th Power : " +pow);
	}

}
