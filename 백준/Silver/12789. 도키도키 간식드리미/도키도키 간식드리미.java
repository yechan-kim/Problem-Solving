import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> stack = new ArrayList<>();

    public static void push(int x) {
        stack.add(x);
    }

    public static int pop() {
        if (isEmpty()) return -1;
        int popped = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return popped;
    }

    public static boolean isEmpty() {
        return stack.isEmpty();
    }

    public static int top() {
        if (isEmpty()) return -1;
        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int[] wait = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int turn = 1;
        int i = 0;

        while (turn <= N) {
            if (i < N && wait[i] == turn) {
                turn++;
                i++;
            } else if (!isEmpty() && top() == turn) {
                pop();
                turn++;
            } else if (i < N) {
                push(wait[i]);
                i++;
            } else {
                break;
            }
        }

        if (isEmpty())
            bw.write("Nice");
        else
            bw.write("Sad");

        bw.flush();
        bw.close();
        bf.close();
    }
}