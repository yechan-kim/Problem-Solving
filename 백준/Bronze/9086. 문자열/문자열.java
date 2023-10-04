import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            char[] arr = str.toCharArray();

            System.out.printf("%c%c\n",arr[0],arr[arr.length - 1]);
        }
    }
}