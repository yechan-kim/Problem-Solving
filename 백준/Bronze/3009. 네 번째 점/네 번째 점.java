import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i=0; i<3; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        System.out.println((x[0]^x[1]^x[2])+" "+(y[0]^y[1]^y[2]));
    }
}