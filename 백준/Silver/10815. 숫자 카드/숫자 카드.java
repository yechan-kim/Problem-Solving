import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set_N = new HashSet<>();
        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(set_N::add);

        int M = Integer.parseInt(br.readLine());
        int arr_M[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            if (set_N.contains(arr_M[i])) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        bw.write(result.toString().trim());

        br.close();
        bw.close();
    }
}