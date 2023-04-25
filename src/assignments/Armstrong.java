package assignments;
import java.util.*;
public class Armstrong {
	
	public static void main(String[] args) {
		
		int num, i,temp, sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		
		num = s.nextInt();
		
		temp = num;
		
		while(num != 0)
		{
			i = num %10;
			
			sum = (int) (sum + Math.pow(i, 3));
			
			num = num / 10;
		}
		if(temp == sum)
		{
			System.out.println( temp+ " number is Armstrong");
		}
		else
		{
			System.out.println( temp+ " number is not Armstrong");
		}
	}

}
