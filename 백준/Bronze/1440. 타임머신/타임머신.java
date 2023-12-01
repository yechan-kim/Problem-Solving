import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] N;
        int[] time = new int[3];
        N = scan.next().split(":");
        int count = 0;

        for (int i = 0; i < 3; i++)
            time[i] = Integer.parseInt(N[i]);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(i != j && j != k && k != i){
                        if(time[i] >= 1 && time[i] <= 12 && time[j] >= 0 && time[j] <= 59 && time[k] >= 0 && time[k] <= 59)
                            count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}