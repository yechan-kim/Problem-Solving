import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> deq = new ArrayDeque<>();
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String[] cmd = bf.readLine().split(" ");

            switch (cmd[0]) {
                case "1":
                    deq.addFirst(cmd[1]);
                    break;
                case "2":
                    deq.addLast(cmd[1]);
                    break;
                case "3":
                    if (deq.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deq.pollFirst() + "\n");
                    break;
                case "4":
                    if (deq.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deq.pollLast() + "\n");
                    break;
                case "5":
                    bw.write(deq.size() + "\n");
                    break;
                case "6":
                    if (deq.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "7":
                    if (deq.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deq.peekFirst() + "\n");
                    break;
                case "8":
                    if (deq.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(deq.peekLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}