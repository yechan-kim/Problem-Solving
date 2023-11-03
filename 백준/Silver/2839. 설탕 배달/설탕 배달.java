import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int tmp = N;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (N == j * 5 + i * 3) {
                    if (tmp > j + i)
                        tmp = j + i;
                }
        }
        
        if (tmp == N)
            System.out.println("-1");
        else
            System.out.println(tmp);
    }
}