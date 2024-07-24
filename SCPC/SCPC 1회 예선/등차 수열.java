/*
You should use the statndard input/output

in order to receive num1 score properly.

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

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int M = sc.nextInt();

            long num1 = sc.nextLong();
            long num2 = sc.nextLong();

            long gcd = num2 - num1;

            for (int i = 2; i < M; i++) {
                num1 = num2;
                num2 = sc.nextInt();
                gcd = gcd(gcd, num2 - num1);

                if (gcd < 0) {
                    break;

                }
            }

            Answer = numberOfDivisor(gcd);

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    public static long gcd(long num1, long num2) {
        if (num1 == 0 && num2 == 0) {
            return 0;
        } else if (num1 == 0 || num2 == 0) {
            return -1;
        }

        long mod = num1 % num2;

        while (mod > 0) {
            num1 = num2;
            num2 = mod;
            mod = num1 % num2;
        }

        return num2;
    }

    public static long numberOfDivisor(long n) {
        if (n < 0) {
            return 0;
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        long result = 1;

        double sqrt = Math.sqrt(n);

        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                result++;
            }
        }

        result = result * 2;

        if (sqrt == (int) sqrt) {
            result++;
        }

        return result;
    }
}