import java.util.Scanner;

public class Main {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		int n= input.nextInt();
		int c = 0 ; int sum = 0 ;
		int [] arr = new int [7];
		for (int i = 0; i < 7; i++) {
			arr[i] = input.nextInt();
		}
	for (int j = 0; j < arr.length; j++) {
		
		sum = sum + arr[j];
		
		if (sum>=n) {
			c++;
			break;
		}

		c++;
		if (arr.length-1==j) {
			j=-1;
		}
	}
	
	int res = c%7;
	if (res ==0) {
		System.out.println(7);
	}
	else {
		System.out.println(res);
	}
	
		System.out.println();
        input.close();
        
	}

}