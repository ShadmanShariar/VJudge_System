import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[100];
        int i = 0;
        while (true) {

            array[i] = input.nextLine();
            if (array[i].equals("*")) {
                break;
            }
            i++;

        }
int x = 1;
        for (int j = 0; j < i; j++) {
            if (array[j].equals("Hajj")) {
                System.out.println("Case " + x + ": Hajj-e-Akbar");
            } else {
                System.out.println("Case " + x + ": Hajj-e-Asghar");
            }
            x++;
        }

    }
}