import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(bf.readLine());

        arr = Arrays.stream(arr).sorted().toArray();

        for (int i = 0; i < N; i++)
            bw.write(arr[i] + "\n");

        bf.close();
        bw.flush();
        bw.close();
    }
}