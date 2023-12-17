import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            String[] cmd = bf.readLine().split("");
            int len = cmd.length;

            for (int j = 0; j < len; j++) {
                if (cmd[j].equals("("))
                    cnt++;
                else if (cmd[j].equals(")"))
                    cnt--;
                if (cnt < 0)
                    break;
            }

            if (cnt == 0)
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}