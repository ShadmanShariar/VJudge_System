import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
	int n = input.nextInt();
	
	for (int i = 0 ; i < n ; i++) {
	
		String s = input.next();
		String s1 = "",s2="";
		s1 = s1+ s.charAt(0);
		s2 = s2+ s.charAt(s.length()-1);
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		
		
	}
		
		
	} 
	
}