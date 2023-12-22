import java.io.*;

public class Main {
    static int[] arr;
    static int N;
    static int front;
    static int rear;

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void push(int X) {
        rear = (rear + 1) % (N + 1);
        arr[rear] = X;
    }

    static int pop() throws IOException {
        if (empty()) {
            bw.write("error\n");
            return -1;
        } else {
            front = (front + 1) % (N + 1);
            return arr[front];
        }
    }

    static boolean empty() {
        return front == rear;
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(bf.readLine());
        arr = new int[N + 1];
        front = 0;
        rear = 0;

        for (int i = 0; i < N; i++)
            push(i + 1);

        while (!empty()) {
            pop();
            if (!empty())
                push(pop());
        }

        bw.write(arr[rear] + "\n");

        bw.flush();
        bw.close();
        bf.close();
    }
}