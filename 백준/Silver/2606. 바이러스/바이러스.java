import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int com = Integer.parseInt(br.readLine());
        int net = Integer.parseInt(br.readLine());
        int[][] arr = new int[com + 1][com + 1];

        for (int i = 0; i < net; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        infectComputers(arr, list, 1);

        bw.write(String.valueOf(list.size() - 1));

        bw.flush();
        bw.close();
        br.close();
    }

    private static void infectComputers(int[][] arr, List<Integer> list, int computer) {
        list.add(computer);

        for (int i = 1; i < arr[computer].length; i++) {
            if (arr[computer][i] == 1 && !list.contains(i)) {
                infectComputers(arr, list, i);
            }
        }
    }
}