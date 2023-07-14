import java.util.Scanner;

public class Main {

	    public static void main(String[] args) 
	    {  
	        Scanner input = new Scanner (System.in);
	       int t = input.nextInt();
	       long sum = 0;
	       for (long i = 0; i < t; i++) {
			
	    	   long a = input.nextLong();
	    	   long b =input.nextLong();
	    	   long res1 =((a-1)*((a-1)+1))/2;
	    	   long res2 = (b*(b+1))/2;
	    	   long ans = res2 - res1;
	    	  sum+=ans;
		}
	      System.out.println(sum);
	        input.close();
	    } 
	
}