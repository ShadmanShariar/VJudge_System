import java.util.Scanner;

public class Main {

   
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);  
      
     int n = input.nextInt();
        for (int i = 0; i < n; i++) {
			
        	int a = input.nextInt();
        	int b = input.nextInt();
        	long c = 0 ; long f = 0 ;
        	for (int j = a; j <= b; j++) {
				String s = Integer.toString(j);
				if (s.contains("0")) {
				c++;
				
				}
				f++;
			}
        	
        	System.out.println(c+"/"+f);
		}
        
        input.close();
        
	
	}
}