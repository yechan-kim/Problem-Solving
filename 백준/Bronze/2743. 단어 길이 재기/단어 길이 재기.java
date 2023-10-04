import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] arr = str.toCharArray();

        System.out.println(arr.length);
    }
}