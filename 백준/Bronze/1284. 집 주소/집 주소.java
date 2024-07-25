import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        while (!input.equals("0")) {
            int width = 1;

            for (int i = 0; i < input.length(); i++) {
                int num = input.charAt(i) - '0';

                if (num == 0) {
                    width += 4;
                } else if (num == 1) {
                    width += 2;
                } else {
                    width += 3;
                }

                width++;
            }

            bw.write(width + "\n");

            input = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}