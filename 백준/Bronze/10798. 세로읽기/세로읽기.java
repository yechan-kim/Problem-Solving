import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = new String[5];

        for (int i = 0; i < 5; i++)
            input[i] = scan.nextLine();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].length() > i)
                    System.out.print(input[j].charAt(i));
            }
        }

    }
}