import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int[] input = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(input).sum();
            if (sum == 0)
                break;
            int max = Arrays.stream(input).max().getAsInt();
            int min = Arrays.stream(input).min().getAsInt();
            int oth = sum - max - min;

            if (max < sum - max && max * max == min * min + oth * oth)
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }


        bw.flush();
        bw.close();
        bf.close();
    }
}