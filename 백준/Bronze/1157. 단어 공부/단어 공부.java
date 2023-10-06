import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase();
        char[] ch_arr = str.toCharArray();
        int[] count = new int[26];

        for (int i = 0; i < ch_arr.length; i++)
            count[ch_arr[i] - 'A']++;

        int max = Arrays.stream(count).max().getAsInt();
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                cnt++;
                idx = i + 'A';
                if (cnt == 2) {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println((char) idx);
    }
}