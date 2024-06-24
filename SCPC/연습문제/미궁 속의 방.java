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

            Answer = 1L;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int N = sc.nextInt();
            long[][] map = new long[N][N];

            int x = 0, y = 0;
            boolean goingRight = true;

            for (long i = 1; i <= N * N; i++) {
                map[y][x] = i;

                if (goingRight) {
                    if (x + 1 < N && y - 1 >= 0) {
                        x++;
                        y--;
                    } else if (x + 1 < N) {
                        x++;
                        goingRight = !goingRight;
                    } else {
                        y++;
                        goingRight = !goingRight;
                    }
                } else {
                    if (y + 1 < N && x - 1 >= 0) {
                        y++;
                        x--;
                    } else if (y + 1 < N) {
                        y++;
                        goingRight = !goingRight;
                    } else {
                        x++;
                        goingRight = !goingRight;
                    }
                }
            }

            int K = sc.nextInt();
            String command = sc.next();
            x = 0;
            y = 0;

            for (int i = 0; i < K; i++) {
                char cmd = command.charAt(i);
                switch (cmd) {
                    case 'U':
                        y--;
                        break;
                    case 'D':
                        y++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                }
                Answer += map[y][x];
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
