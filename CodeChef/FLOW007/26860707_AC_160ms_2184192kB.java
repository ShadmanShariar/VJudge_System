import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		for (int i = 0 ; i < n ; i++) {
          int num=0;
	      int rev =0;
	      num = input.nextInt();
	      while( num != 0 )
	      {
	          rev = rev * 10;
	          rev = rev + num%10;
	          num = num/10;
	      }

	      System.out.println(rev);
		
		}
	} 
	
}