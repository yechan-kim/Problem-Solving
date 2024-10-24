import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> clothes = new HashMap<>();
            int result = 1;
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");

                if (clothes.containsKey(input[1])) {
                    clothes.put(input[1], clothes.get(input[1]) + 1);
                } else {
                    clothes.put(input[1], 1);
                }
            }

            for (int val : clothes.values()) {
                result *= (val + 1);
            }

            bw.write(result - 1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
