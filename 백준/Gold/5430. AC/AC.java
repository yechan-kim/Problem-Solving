import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String cmd = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String tmp = br.readLine();
            tmp = tmp.substring(1, tmp.length() - 1);
            String[] tmp_arr = tmp.split(",");
            List<Integer> arr = new ArrayList<>();

            for (int j = 0; j < N; j++)
                arr.add(Integer.parseInt(tmp_arr[j]));

            boolean reverse = false;

            for (int j = 0; j < cmd.length(); j++) {
                if (cmd.charAt(j) == 'R') {
                    reverse = !reverse;
                } else if (cmd.charAt(j) == 'D') {
                    if (arr.size() == 0) {
                        bw.write("error\n");
                        break;
                    }
                    if (reverse) {
                        arr.remove(arr.size() - 1);
                    } else {
                        arr.remove(0);
                    }
                }

                if (j == cmd.length() - 1) {
                    bw.write("[");
                    for (int k = 0; k < arr.size(); k++) {
                        bw.write(arr.get(reverse ? arr.size() - 1 - k : k).toString());
                        if (k != arr.size() - 1)
                            bw.write(",");
                    }
                    bw.write("]\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}