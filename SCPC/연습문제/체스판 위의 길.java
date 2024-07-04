/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
    static int Answer;
    static int MOD = 1000000007;
    static HashMap<Integer, ArrayList<Integer>> obstacles;

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

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            obstacles = new HashMap<>();
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            obstacles = new HashMap<>();

            for (int i = 0; i < K; i++) {
                int row = sc.nextInt() - 1;
                int col = sc.nextInt() - 1;

                if (row >= N || col >= M) continue;
                if (!obstacles.containsKey(row)) {
                    obstacles.put(row, new ArrayList<>());
                }
                obstacles.get(row).add(col);
            }

            int[] dp = new int[M];
            for (int i = 0; i < M; i++) {
                if (obstacles.containsKey(0) && obstacles.get(0).contains(i)) {
                    dp[i] = 0;
                } else {
                    dp[i] = i == 0 ? 1 : dp[i - 1];
                }
            }


            for (int i = 1; i < N; i++) {
                int[] newDp = new int[M];
                for (int j = 0; j < M; j++) {
                    if (obstacles.containsKey(i) && obstacles.get(i).contains(j)) {
                        newDp[j] = 0;
                    } else {
                        newDp[j] = dp[j];
                        if (j > 0) {
                            newDp[j] = (newDp[j] + newDp[j - 1]) % MOD;
                        }
                    }
                }
                dp = newDp;
            }

            Answer = dp[M - 1] % MOD;

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}