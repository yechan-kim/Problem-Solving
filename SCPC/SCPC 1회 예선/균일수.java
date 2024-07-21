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
    static int Answer;
    static int N;

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

            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            N = sc.nextInt();
            Answer = N - 1;

            for (int i = 2; i <= Math.min(N, Math.pow(10, 5)); i++) {

                if (check_uniform(i) == 1) {
                    Answer = i;
                    break;
                }
            }

            if (Answer == N - 1) {
                Answer = modu(N);
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    static int modu(int N) {
        int mini = N - 1;

        for (int i = 2; i <= Math.pow(10, 4); i++) {
            if (N % i == 0) {
                if (N / i - 1 > Math.pow(10, 5)) {
                    mini = Math.min(N / i - 1, mini);
                }
            }
        }

        return mini;
    }

    static int check_base_square(int base) {
        for (int i = 0; i <= 30; i++) {
            if (N < Math.pow(base, i)) {
                return i - 1;

            }
        }

        return 0;
    }

    static int check_uniform(int base) {
        int Q;
        int max_square;

        max_square = check_base_square(base);

        Q = N % base;

        int sum = 0;

        for (int i = 0; i <= max_square; i++) {
            sum += (int) (Q * Math.pow(base, i));

        }

        if (sum == N) {
            return 1;
        } else {
            return 0;
        }
    }
}