import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        Map<Long, Integer> frequencyMap = new HashMap<>();
        Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).forEach(num -> {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        });

        long M = Long.parseLong(br.readLine());
        long arr_M[] = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        for (int i = 0; i < M; i++) {
            int cnt = frequencyMap.getOrDefault(arr_M[i], 0);
            bw.write(cnt + " ");
        }

        br.close();
        bw.close();
    }
}