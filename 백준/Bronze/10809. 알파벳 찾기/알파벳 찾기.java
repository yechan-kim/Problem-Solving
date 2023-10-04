import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        char[] arr = S.toCharArray();
        int[] count = new int[26];
        Arrays.fill(count, -1);

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - 'a'] == -1)
                count[arr[i] - 'a'] = i;
        }

        for (int i = 0; i < count.length; i++)
            System.out.print(count[i] + " ");
    }
}