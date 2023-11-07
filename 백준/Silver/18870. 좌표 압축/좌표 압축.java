import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(input[i]);

        br.close();

        int[] sortedArr = Arrays.stream(arr).distinct().sorted().toArray();

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < sortedArr.length; i++) {
            indexMap.put(sortedArr[i], i);
        }
        
        for (int i = 0; i < N; i++) {
            int index = indexMap.get(arr[i]);
            bw.write(index + " ");
        }

        bw.flush();
        bw.close();
    }
}