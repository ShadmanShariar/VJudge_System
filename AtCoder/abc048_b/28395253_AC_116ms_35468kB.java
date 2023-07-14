import java.util.Scanner;

public class Main {

	    static long cd(long A, long B, long M) 
	    {  
	        if (A % M == 0) 
	            return (B / M) - (A / M) + 1; 
	        return (B / M) - (A / M); 
	    }  
	    public static void main(String[] args) 
	    {  
	        Scanner input = new Scanner (System.in);
	        long a = input.nextLong();
	        long b = input.nextLong();
	        long c =input.nextLong();
	        
	        System.out.println(cd(a, b, c)); 
	        input.close();
	    } 
	
}