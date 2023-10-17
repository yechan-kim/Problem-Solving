import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = bf.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        if ((V - A) % (A - B) == 0) {
            int i = (V - A) / (A - B);
            String s = String.valueOf(i + 1);
            bw.write(s + "\n");
            bw.flush();
            bw.close();
        } else {
            int i = (V - A) / (A - B);
            String s = String.valueOf(i + 2);
            bw.write(s + "\n");
            bw.flush();
            bw.close();
        }
    }
}