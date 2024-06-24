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
    static final int[] scores = {
            6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8,
            16, 7, 19, 3, 17, 2, 15, 10
    };

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
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                double radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

                if (radius > E) continue;

                if (radius >= 0 && radius <= A) {
                    Answer += 50;
                    continue;
                }

                double degree = Math.atan2(y, x) * 180 / Math.PI;
                if (degree < 0) degree += 360;

                int index = (int) ((degree + 9) % 360) / 18;
                int score = scores[index];

                if (radius >= B && radius <= C) Answer += score * 3;
                else if (radius >= D && radius <= E) Answer += score * 2;
                else Answer += score;
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
