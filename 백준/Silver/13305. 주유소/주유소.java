import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] distance = new int[n];
        int[] fuelPrice = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        distance[n - 1] = 0; // 다음으로 갈 도시가 없음

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            fuelPrice[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        long sum = 0L;

        sum += (long) distance[0] * fuelPrice[0];

        for (int i = 1; i < n - 1; i++) {
            if (fuelPrice[i - 1] < fuelPrice[i]) {
                fuelPrice[i] = fuelPrice[i - 1];
            }
            sum += (long) distance[i] * fuelPrice[i];
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
    }
}
