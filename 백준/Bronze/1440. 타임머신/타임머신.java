import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] N;
        int[] time = new int[3];
        int HH = 0, MM = 0, SS = 0;
        N = scan.next().split(":");

        for (int i = 0; i < 3; i++) {
            time[i] = Integer.parseInt(N[i]);

//            if (time[i] >= 1 && time[i] <= 12)
//                HH++;
            if (time[i] >= 13 && time[i] <= 59) {
//                MM++;
//                SS++;
                HH++;
            }
            if (time[i] == 0) {
                HH++;
            } else if(time[i] >59) {
                MM++;
            }
        }
        if(MM>0){
            System.out.println(0);
        }else {
            System.out.println((3 - HH) * 2);
        }
    }
}