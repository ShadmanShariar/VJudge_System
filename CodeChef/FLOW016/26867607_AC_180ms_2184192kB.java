import java.util.Scanner;
public class Main {
		public static long Gcd(long a, long b) {
			while(a != b)
			{
				if(a>b) a=a-b;	
				else b=b-a;
					
			}
			return a;
		}
		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			int t=input.nextInt();
			long a,b,Gcd,Lcm;
			while(t-->0)
			{
				a=input.nextInt();
				b=input.nextInt();
				Gcd=Gcd(a,b);
				Lcm=(a*b)/Gcd;
				System.out.println(Gcd+" "+Lcm);
			}
				
		}
	
}