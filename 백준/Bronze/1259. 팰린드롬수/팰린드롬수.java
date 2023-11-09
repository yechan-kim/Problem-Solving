import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.next();

            if (number.equals("0")) {
                break;
            }

            if (isPalindrome(number)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }

    public static boolean isPalindrome(String number) {
        int left = 0;
        int right = number.length() - 1;

        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}