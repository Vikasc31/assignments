package assignments;
import java.util.*;
public class SumAll {
	
	public static void main(String[] args) {
		
		int num, num2,sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any digit");
		
		num = s.nextInt();
		
		while(num != 0)
		{
			num2 = num % 10;
			
			sum = sum + num2;
			
			num = num / 10;
		}
		System.out.println("Sum = " +sum);
	}

}
