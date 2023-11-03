import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] ch_arr = str.toCharArray();
        int[] arr = new int[ch_arr.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = ch_arr[i] - 48;

        arr = Arrays.stream(arr).sorted().toArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}