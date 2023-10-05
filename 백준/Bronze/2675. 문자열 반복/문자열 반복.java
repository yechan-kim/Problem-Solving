import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        for(int i=0; i<T; i++)
        {
            int R = scan.nextInt();
            String S = scan.next();
            char[] arr = S.toCharArray();

            for(int j=0; j<arr.length; j++)
            {
                for(int k=0; k<R; k++)
                    System.out.print(arr[j]);
            }

            System.out.println();
        }
    }
}