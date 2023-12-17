import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] cmd = bf.readLine().split("");
            if (cmd[0].equals("."))
                break;
            int len = cmd.length;
            int ecnt = 0;
            String[] s = new String[100];
            int top = -1;

            for (int j = 0; j < len; j++) {
                if (cmd[j].equals("(") || cmd[j].equals("[")) {
                    s[++top] = cmd[j];
                } else if (cmd[j].equals(")")) {
                    if (top >= 0 && s[top].equals("("))
                        top--;
                    else {
                        ecnt++;
                        break;
                    }
                } else if (cmd[j].equals("]")) {
                    if (top >= 0 && s[top].equals("["))
                        top--;
                    else {
                        ecnt++;
                        break;
                    }
                }
                if (top == -2)
                    break;
            }

            if (top == -1 && ecnt == 0)
                bw.write("yes\n");
            else
                bw.write("no\n");
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}