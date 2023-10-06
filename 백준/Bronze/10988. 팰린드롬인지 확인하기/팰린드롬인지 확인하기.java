import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch_arr = str.toCharArray();

        for(int i=0; i< ch_arr.length/2; i++)
        {
            if(ch_arr[i] != ch_arr[ch_arr.length-1-i])
            {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}