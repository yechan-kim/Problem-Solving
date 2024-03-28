import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<T; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int max = arr[T-1];
        int min = arr[0];

        bw.write(max * min+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}