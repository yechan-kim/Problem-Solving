import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
        } else
            M -= 45;
        
        System.out.println(H + " " + M);
    }
}