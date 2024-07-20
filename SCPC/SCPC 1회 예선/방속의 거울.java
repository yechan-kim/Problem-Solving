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
            int N = sc.nextInt();
            sc.nextLine(); // for dummy buffer

            char[][] mirror = new char[N][N];

            boolean[][] visit = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                String reflect = sc.nextLine();

                for (int j = 0; j < N; j++) {
                    mirror[i][j] = reflect.charAt(j);
                    visit[i][j] = false;
                }
            }

            int x = 0, y = 0, direction = 1;

            while (x >= 0 && x < N && y >= 0 && y < N) {
                if (mirror[x][y] == '1') {
                    if (!visit[x][y]) {
                        Answer++;
                        visit[x][y] = true;
                    }
                    direction = 5 - direction;
                } else if (mirror[x][y] == '2') {
                    if (!visit[x][y]) {
                        Answer++;
                        visit[x][y] = true;
                    }
                    if (direction < 3) {
                        direction = 3 - direction;
                    } else {
                        direction = 7 - direction;
                    }
                }

                switch (direction) {
                    case 1: {
                        y++;
                        break;
                    }
                    case 2: {
                        x++;
                        break;
                    }
                    case 3: {
                        y--;
                        break;
                    }
                    case 4: {
                        x--;
                        break;
                    }
                    default:
                        break;
                }
            }

            // Print the answer to standard output(screen).
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}