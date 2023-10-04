import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String ch = scan.next();
        char[] arr = ch.toCharArray();

        if(arr.length > N){
            System.out.println("Error");
            return;
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]-48;
        }
        System.out.println(sum);
    }
}