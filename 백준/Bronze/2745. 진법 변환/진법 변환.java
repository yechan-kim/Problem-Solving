import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int B = scan.nextInt();
        int result = 0;
        int length = input.length();

        for(int i = 0; i < length; i++) {
            char c = input.charAt(i);
            int num = 0;
            if(c >= 'A' && c <= 'Z') {
                num = c - 'A' + 10;
            } else {
                num = c - '0';
            }
            result += num * Math.pow(B, length - i - 1);
        }

        System.out.println(result);
    }
}