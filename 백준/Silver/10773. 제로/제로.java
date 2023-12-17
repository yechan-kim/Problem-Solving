import java.util.*;

public class Main {
    static int[] stack = new int[100001];
    static int top = 0;

    public static void push(int x) {
        stack[++top] = x;
    }

    public static void pop() {
        stack[top--] = 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            if (x == 0) {
                pop();
            } else {
                push(x);
            }
        }

        System.out.println(Arrays.stream(stack).sum());
    }
}