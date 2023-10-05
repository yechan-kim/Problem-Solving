import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] str_arr = str.split("\\s");

        int cnt = 0;
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].isEmpty())
                cnt++;
        }

        System.out.println(str_arr.length - cnt);
    }
}