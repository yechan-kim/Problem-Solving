import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int L = scan.nextInt();
        int D = scan.nextInt();
        int time = 0;

        for (int i = 0; i < N; i++) {
            time += L + 5;
            for (int j = time - 5; j < time; j++) {
                if (j % D == 0) {
                    System.out.println(j);
                    return;
                }
            }

            if (i == N - 1) {
                while (true) {
                    time ++;
                    for (int j = time - 5; j < time; j++) {
                        if (j % D == 0) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
    }
}