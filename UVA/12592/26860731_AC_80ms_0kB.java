import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String [] s = new String [n*2];
		for (int i = 0 ; i < n*2 ; i++) {
			
          s[i] = input.nextLine();

		}
		
		int a = input.nextInt();
		input.nextLine();
		for (int i = 0 ; i < a ; i++) {
			String str = input.nextLine();
			
			for (int j = 0 ; j < n*2 ; j ++) {
				
				if (str.equals(s[j])) {
					
					System.out.println(s[j+1]);
					break;
				}
			}
			
		}
		
		
	} 
	
}