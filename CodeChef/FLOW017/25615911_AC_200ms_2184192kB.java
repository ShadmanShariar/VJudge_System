import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int array [] = new int [3];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array[j] = input.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[1]);
        }
        
    }
}