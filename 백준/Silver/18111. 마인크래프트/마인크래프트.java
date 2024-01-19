import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++)
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(map).flatMapToInt(Arrays::stream).min().getAsInt();
        int max = Arrays.stream(map).flatMapToInt(Arrays::stream).max().getAsInt();

        int time = 99999999;
        int high = 0;

        for (int i = min; i <= max; i++) {
            int count = 0;
            int block = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i < map[j][k]) {
                        count += ((map[j][k] - i) * 2);
                        block += (map[j][k] - i);
                    } else {
                        count += (i - map[j][k]);
                        block -= (i - map[j][k]);
                    }
                }
            }

            if (block < 0)
                break;

            if (time >= count) {
                time = count;
                high = i;
            }
        }
        
        System.out.println(time + " " + high);

        br.close();
    }
}