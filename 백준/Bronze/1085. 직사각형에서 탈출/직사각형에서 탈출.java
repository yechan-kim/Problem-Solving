import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        if (x < 0 || x >= w || y < 0 || y >= h || w < 0 || w > 1000 || h < 0 || h > 1000)
            System.out.println("error");
        else
            System.out.println(min(x, min(w - x, min(y, h - y))));
    }
}