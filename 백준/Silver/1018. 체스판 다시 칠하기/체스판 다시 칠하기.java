import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static int cnt = 1000;
    public static char chess[][];

    public static int alpha(int tmpN, int tmpM, int A, int B) {
        for (int a = 0; a <= tmpN - 8; a++) {
            for (int b = 0; b <= tmpM - 8; b++) {
                int cnt1 = 0;
                int cnt2 = 0;

                for (int i = 0 + a; i < A + a; i++) {
                    for (int j = 0 + b; j < B + b; j++) {
                        if ((i + j) % 2 == 0) {
                            if (chess[i][j] != 'W')
                                cnt1++;
                        }
                        if ((i + j) % 2 == 1) {
                            if (chess[i][j] != 'B')
                                cnt1++;
                        }
                    }
                }
                cnt = min(cnt, cnt1);

                for (int i = 0 + a; i < A + a; i++) {
                    for (int j = 0 + b; j < B + b; j++) {
                        if ((i + j) % 2 == 0) {
                            if (chess[i][j] != 'B')
                                cnt2++;
                        }
                        if ((i + j) % 2 == 1) {
                            if (chess[i][j] != 'W')
                                cnt2++;
                        }
                    }
                }
                cnt = min(cnt, cnt2);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        chess = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = scan.next();
            for (int j = 0; j < M; j++)
                chess[i][j] = str.charAt(j);
        }

        int cnta = alpha(N, M, 8, 8);
        int cntb = alpha(N, 8, 8, M);
        int cntc = alpha(8, M, N, 8);
        int cntd = alpha(8, 8, N, M);

        cnt = min(cnta, min(cntb, min(cntc, cntd)));

        System.out.println(cnt);
    }
}