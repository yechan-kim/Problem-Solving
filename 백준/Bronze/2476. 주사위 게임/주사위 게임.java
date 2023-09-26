import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] reward = new int[N];

        for (int i = 0; i < N; i++) {
            int dice_1 = scan.nextInt();
            int dice_2 = scan.nextInt();
            int dice_3 = scan.nextInt();

            if (dice_1 == dice_2 && dice_1 == dice_3)
                reward[i] = (10000 + dice_1 * 1000);
            else if (dice_1 == dice_2 || dice_1 == dice_3)
                reward[i] = (1000 + dice_1 * 100);
            else if (dice_2 == dice_3)
                reward[i] = (1000 + dice_2 * 100);
            else
                reward[i]= Math.max(dice_1, Math.max(dice_2, dice_3)) * 100;
        }
        System.out.println(Arrays.stream(reward).max().getAsInt());
    }
}
