import java.util.Arrays;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++) {
            array [i] = input.nextInt();
        }
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
           sum = sum + (array[n-1]-array[i]);
        }
        
        System.out.println(sum);
    }
    
}