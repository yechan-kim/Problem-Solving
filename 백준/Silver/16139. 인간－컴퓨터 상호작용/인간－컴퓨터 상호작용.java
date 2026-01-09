import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int n = s.length();

        Map<Character, int[]> prefixSumMap = new HashMap<>();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (!prefixSumMap.containsKey(a)) {
                int[] prefix = new int[n + 1];

                for (int j = 0; j < n; j++) {
                    prefix[j + 1] = prefix[j];

                    if (s.charAt(j) == a) {
                        prefix[j + 1] += 1;
                    }
                }

                prefixSumMap.put(a, prefix);
            }

            int[] prefix = prefixSumMap.get(a);
            int cnt = prefix[r + 1] - prefix[l];

            bw.write(cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
