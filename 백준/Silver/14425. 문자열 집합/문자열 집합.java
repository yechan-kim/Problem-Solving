import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        String[] arr_N = new String[N];
        int M = Integer.parseInt(input[1]);
        String[] arr_M = new String[M];
        int cnt = 0;

        for (int i = 0; i < N; i++)
            arr_N[i] = br.readLine();

        for (int i = 0; i < M; i++)
            arr_M[i] = br.readLine();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr_N[i].equals(arr_M[j]))
                    cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
        bw.close();
    }
}