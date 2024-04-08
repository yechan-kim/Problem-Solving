import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] height = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    height[i] = height[j] = 0;
                    Arrays.sort(height);

                    for (int k = 2; k < 9; k++) {
                        sb.append(height[k]).append("\n");
                    }

                    bw.write(sb.toString());

                    bw.flush();
                    bw.close();
                    br.close();

                    return;
                }
            }
        }
    }
}