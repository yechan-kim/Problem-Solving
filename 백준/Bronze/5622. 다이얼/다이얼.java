import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] ch_arr = str.toCharArray();

        int time = 0;
        for (int i = 0; i < ch_arr.length; i++) {
            if (ch_arr[i] < 'S')
                time += (ch_arr[i] - 'A') / 3 + 3;
            else if (ch_arr[i] == 'S')
                time += 8;
            else if (ch_arr[i] < 'W')
                time += 9;
            else
                time += 10;
        }

        System.out.println(time);
    }
}