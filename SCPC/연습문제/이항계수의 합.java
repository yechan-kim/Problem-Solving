/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful.
*/

import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
    static long Answer;
    static final int MOD = 1000000007;
    static final int MAX = 2000002;
    static long[] fac = new long[MAX + 1];
    static long[] facInv = new long[MAX + 1];

    public static void main(String args[]) throws Exception {
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));

        long top = 1;

        for (int i = 1; i <= MAX; i++) {
            fac[i] = (top = (top * i) % MOD);
        }

        getInv();

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int N = sc.nextInt();
            int M = sc.nextInt();

            Answer = getBinary(N, M) - 1;

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    static long getInvN(long x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n % 2 == 0) return getInvN((x * x) % MOD, n / 2) % MOD;
        else return (x * getInvN((x * x) % MOD, (n - 1) / 2)) % MOD;
    }

    static void getInv() {
        facInv[MAX] = getInvN(fac[MAX], MOD - 2);
        for (int i = MAX - 1; i > 0; i--) {
            facInv[i] = ((i + 1) * facInv[i + 1]) % MOD;
        }
    }

    static long getBinary(int x, int y) {
        return (fac[x + y + 2] * ((facInv[x + 1] * facInv[y + 1]) % MOD)) % MOD;
    }
}