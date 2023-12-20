import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = new int[2000000];
    static int front;
    static int rear;

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void push(int X) {
        if (rear == 2000000)
            return;
        else {
            arr[rear] = X;
            rear++;
        }
    }

    static void pop() throws IOException {
        if (empty())
            bw.write("-1\n");

        else {
            bw.write(arr[front] + "\n");
            front++;
        }
    }

    static void size() throws IOException {
        bw.write(rear - front + "\n");
    }

    static boolean empty() {
        if (front == rear)
            return true;
        else
            return false;
    }

    static void empty_f() throws IOException {
        if (empty())
            bw.write("1\n");

        else
            bw.write("0\n");
    }

    static void front() throws IOException {
        if (empty())
            bw.write("-1\n");

        else
            bw.write(arr[front] + "\n");
    }

    static void back() throws IOException {
        if (empty())
            bw.write("-1\n");

        else
            bw.write(arr[rear - 1] + "\n");
    }

    public static void main(String[] args) throws IOException {

        front = 0;
        rear = 0;

        int N = Integer.parseInt(bf.readLine());
        String[] opt = new String[2];

        for (int i = 0; i < N; i++) {

            opt = bf.readLine().split(" ");

            if (opt[0].equals("push"))
                push(Integer.parseInt(opt[1]));

            else if (opt[0].equals("pop"))
                pop();

            else if (opt[0].equals("size"))
                size();

            else if (opt[0].equals("empty"))
                empty_f();

            else if (opt[0].equals("front"))
                front();

            else if (opt[0].equals("back"))
                back();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}