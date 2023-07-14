
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            ar[i] = array[i];
        }
        Arrays.sort(array);

        int i = 0, j = 0;
        int count = 0;
        while (i < array.length && j < array.length) {

            if (array[i] != ar[j]) {
                count++;
            }

            i++;
            j++;
        }
        if (count > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}