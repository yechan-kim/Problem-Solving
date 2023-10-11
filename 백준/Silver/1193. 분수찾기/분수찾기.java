import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int i = 1, j = 1, cnt = 1;

        while (true) {
            if (cnt == X) {
                System.out.println(i + "/" + j);
                return;
            }

            if (i == 1) {
                j++;
                cnt++;

                if (cnt == X) {
                    System.out.println(i + "/" + j);
                    return;
                }

                while (j > 1) {
                    i++;
                    j--;
                    cnt++;

                    if (cnt == X) {
                        System.out.println(i + "/" + j);
                        return;
                    }
                }
            } else if (j == 1) {
                i++;
                cnt++;

                if (cnt == X) {
                    System.out.println(i + "/" + j);
                    return;
                }

                while (i > 1) {
                    i--;
                    j++;
                    cnt++;

                    if (cnt == X) {
                        System.out.println(i + "/" + j);
                        return;
                    }
                }
            }
        }
    }
}