package assignments;
import java.util.*;
public class Hours {
	
	public static void main(String[] args)
    {
        int S, H, M, seconds;
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Input seconds: ");
	    
        seconds = scan.nextInt();
        
        S = seconds % 60;
        
        H = seconds / 60;
        
        M = H % 60;
        
        H = H / 60;
        
        System.out.print( H + " Hours " + M + " Minutes " + S + " Seconds ");
		
    }

}
