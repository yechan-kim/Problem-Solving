import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int result = N;

        for (int i = 0; i < N; i++) {
            String str = scan.next();
            char[] ch_arr = str.toCharArray();
            int[] cnt = new int[26];

            for (int j = 0; j < ch_arr.length; j++) {
                if(cnt[ch_arr[j] - 'a'] > 0 && ch_arr[j] != ch_arr[j-1]) {
                    result--;
                    break;
                }
                cnt[ch_arr[j] - 'a']++;
            }
        }
        System.out.println(result);
    }
}