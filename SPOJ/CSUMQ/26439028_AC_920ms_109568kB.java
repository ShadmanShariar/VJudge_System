import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int [] a = new int [n];
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            int s = input.nextInt();
            int  t = input.nextInt();
            for (int j = s; j <= t; j++) {
              sum = sum + a[j];  
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}