
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

        for (int i = 0; i < p; i++) {

            int temp;
            int sum = 0;
            int x = input.nextInt();
            temp = x;

            while (temp != 0) {
                int z = temp % 10;
                sum = sum * 10 + z;
                temp = temp / 10;
            }
            System.out.println(sum);
        }
    }

}