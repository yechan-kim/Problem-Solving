import java.io.*;

public class Main {
    static int[] stack = new int[1000000];
    static int top = 0;

    public static void push(int x) {
        stack[++top] = x;
    }

    public static int pop() {
        if (top == 0) return -1;
        return stack[top--];
    }

    public static int size() {
        return top;
    }

    public static int empty() {
        if (top == 0) return 1;
        return 0;
    }

    public static int top() {
        if (top == 0) return -1;
        return stack[top];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            String[] cmd = bf.readLine().split(" ");
            switch (cmd[0]) {
                case "1":
                    push(Integer.parseInt(cmd[1]));
                    break;
                case "2":
                    bw.write(pop() + "\n");
                    break;
                case "3":
                    bw.write(size() + "\n");
                    break;
                case "4":
                    bw.write(empty() + "\n");
                    break;
                case "5":
                    bw.write(top() + "\n");
                    break;
            }
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}