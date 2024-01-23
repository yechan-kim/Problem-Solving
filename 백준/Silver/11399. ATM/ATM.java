import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());
        int[] arr =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int time = 0;

        Arrays.sort(arr);

        for(int i=0; i<N; i++)
            time += arr[i] * (N-i);

        System.out.println(time);
        br.close();
    }
}