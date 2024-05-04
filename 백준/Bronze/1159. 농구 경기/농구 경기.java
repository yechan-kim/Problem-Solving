import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        boolean possible = false;

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char c = name.charAt(0);

            arr[c - 97]++;
            if (arr[c - 97] == 5) {
                possible = true;
            }
        }

        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    sb.append((char) (i + 97));
                }
            }
        } else {
            sb.append("PREDAJA");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}