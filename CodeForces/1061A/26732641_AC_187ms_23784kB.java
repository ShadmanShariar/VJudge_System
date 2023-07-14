import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		
		Scanner input = new Scanner (System.in);
		
	    int n = input.nextInt();
	    
	   int p =  input.nextInt();
	   
	   if (p%n!=0) {
		   
		   System.out.println((p/n)+1);
	   }
	   else {
		   
		   System.out.println(p/n);
	   }
	    	
	    
	    	  
	     
	     input.close();
	} 
}