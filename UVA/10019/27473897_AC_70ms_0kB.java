import java.util.Scanner;

public class Main {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int num = input.nextInt();
			String b = Integer.toBinaryString(num); 
			
			String p = Integer.toString(num);
			int num2 = Integer.parseInt(p, 16);
			String binary = Integer.toBinaryString(num2);
			int x = 0 , y = 0;
			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j)=='1') {
					x++;
				}
			}
			for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j)=='1') {
					y++;
				}
			}
			System.out.println(y+" "+x);
		}
		
input.close();
        
	}

}