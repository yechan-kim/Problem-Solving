import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        input = input.replaceAll("c=", "1");
        input = input.replaceAll("c-", "2");
        input = input.replaceAll("dz=", "3");
        input = input.replaceAll("d-", "4");
        input = input.replaceAll("lj", "5");
        input = input.replaceAll("nj", "6");
        input = input.replaceAll("s=", "7");
        input = input.replaceAll("z=", "8");

        char [] arr = input.toCharArray();

        System.out.println(arr.length);
    }
}