import java.io.*;

public class Main {
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            cnt = 0;
            String s = br.readLine();
            sb.append(isPalindrome(s) + " " + cnt + "\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    static int recursion(String s, int l, int r) {
        cnt++;

        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}