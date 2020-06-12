package wipro;
import java.util.Scanner;

public class seven {
	
		public static void main(String[] input)
	    {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter a Value : ");
	        char j = scan.next().charAt(0);
	        System.out.println(j+" ->"+Character.toUpperCase(j));
	        
	        
	        int l=j-32; 
	        
	        char K =(char)l;
	        System.out.println(j+" ->"+Character.toLowerCase(j));

}
	}
