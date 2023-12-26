import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Set<Integer> inputSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            inputSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(bf.readLine());
        int[] input2 = new int[M];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            input2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            bw.write(inputSet.contains(input2[i]) ? "1\n" : "0\n");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}