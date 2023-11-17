import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int M = input[1];

        String[] index = new String[N];
        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            index[i] = br.readLine();
            indexMap.put(index[i], i + 1);
        }

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0)))
                bw.write(index[Integer.parseInt(query) - 1] + "\n");
            else
                bw.write(indexMap.get(query) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}