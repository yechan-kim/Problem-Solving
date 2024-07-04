/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful.
*/

import java.util.Arrays;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
    static int Answer;
    static int MOD = 1000000007;
    static int MAX_OBSTACLE = 200000;

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

        init();

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            Point[] points = new Point[k + 1];

            for (int i = 0; i < k; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                points[i] = new Point(a, b);
            }

            Point finalPoint = new Point(n, m);
            points[k] = finalPoint;

            Arrays.sort(points);

            int index = Arrays.binarySearch(points, finalPoint);

            int[] pathNumber = new int[index + 1];

            for (int i = 0; i < index + 1; i++) {
                long otherPointPathNumber = 0;

                if (points[i].y > m || points[i].x > n)
                    continue;

                for (int j = 0; j < i; j++) {
                    if (points[j].y <= points[i].y && points[j].x <= points[i].x) {

                        long temp = pathNumber[j];

                        temp = (temp * combination(points[i].x - points[j].x + points[i].y - points[j].y, points[i].y - points[j].y)) % MOD;

                        otherPointPathNumber = (otherPointPathNumber + temp) % MOD;
                    }
                }

                int totalPath = combination(points[i].x + points[i].y - 2, points[i].x - 1);
                totalPath -= (int) otherPointPathNumber;
                totalPath = (MOD + totalPath) % MOD;

                pathNumber[i] = totalPath;
            }

            Answer = pathNumber[index];

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    public static int combination(int a, int b) {
        long e = factorial[a];
        e = (e * factorialInverse[b]) % MOD;
        e = (e * factorialInverse[a - b]) % MOD;
        return (int) e;
    }

    static int[] factorial = new int[MAX_OBSTACLE + 1];
    static int[] factorialInverse = new int[MAX_OBSTACLE + 1];

    public static void init() {
        long o = 1;
        factorial[0] = 1;
        for (int i = 1; i < MAX_OBSTACLE + 1; i++) {
            o = (o * i) % MOD;
            factorial[i] = (int) o;
        }
        long oi = inversefactorial((int) o);
        for (int i = MAX_OBSTACLE; i >= 0; i--) {
            factorialInverse[i] = (int) oi;
            oi = (oi * i) % MOD;
        }
    }

    public static int inversefactorial(int x) {
        return power(x, MOD - 2);
    }

    public static int power(int x, int p) {
        if (p == 1)
            return x;
        int t = power(x, p / 2);
        long result = t;
        result = (result * t) % MOD;
        if (p % 2 == 1) {
            result = (result * x) % MOD;
        }
        return (int) result;
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (x > o.x)
                return 1;
            else if (x < o.x)
                return -1;
            else {
                if (y > o.y)
                    return 1;
                else if (y < o.y)
                    return -1;
                else
                    return 0;
            }
        }
    }
}