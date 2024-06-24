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
            int K = sc.nextInt();
            String cmd = sc.next();

            int x = 0, y = 0;
            int base = 0;
            boolean rd = false;

            for (int i = 0; i < K; i++) {
                switch (cmd.charAt(i)) {
                    case 'U':
                        x--;
                        rd = false;
                        break;
                    case 'D':
                        x++;
                        rd = true;
                        break;
                    case 'L':
                        y--;
                        rd = false;
                        break;
                    case 'R':
                        y++;
                        rd = true;
                        break;
                }

                int pointSum = x + y;
                if (pointSum < N) {
                    if (rd) base += pointSum;
                    else base -= pointSum + 1;
                    if (pointSum % 2 == 0) Answer += base + y + 1;
                    else Answer += base + x + 1;
                } else {
                    if (rd) base += 2 * N - pointSum;
                    else base -= 2 * N - (pointSum + 1);
                    if (pointSum % 2 == 0) Answer += base + N - x;
                    else Answer += base + N - y;
                }
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
