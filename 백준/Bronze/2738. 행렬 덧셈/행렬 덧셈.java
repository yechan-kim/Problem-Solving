import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int arr1[][] = new int[N][M];
        int arr2[][] = new int[N][M];
        int sum_arr[][] = new int[N][M];

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
                arr1[i][j] = scan.nextInt();
        }

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
                arr2[i][j] = scan.nextInt();
        }

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
                sum_arr[i][j] = arr1[i][j] + arr2[i][j];
        }

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
                System.out.print(sum_arr[i][j] + " ");
            System.out.println();
        }
    }
}
