import java.util.*;
public class PalindromeString{

	public static void main(String arg[])
	{
	
		String name, temp = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any string :");

		name = scan.nextLine();

		int length = name.length();


		for (int i = (length - 1); i >=0; --i) 
		{
      			temp = temp + name.charAt(i);
		}
		
		System.out.println("Reverse string :" + temp);

		if (name.equalsIgnoreCase(temp))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Non Palindrome string");
		}
	}
}