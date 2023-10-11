import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int result =2;

        for(int i=0; i<N; i++)
            result += (int)Math.pow(2,i);

        result*=result;

        System.out.println(result);
    }
}