import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int p = input.nextInt();

        for (int i = 0; i < p; i++) {
            
      
        int temp;

        int x = input.nextInt();
        temp = x;
        int[] array = new int[20];
        int c = 0;
        while (temp != 0) {
            int z = temp % 10;
            array[c] = z;
            c++;
            temp = temp / 10;
        }
        System.out.println(array[0] + array[c - 1]);
        }
    }

}