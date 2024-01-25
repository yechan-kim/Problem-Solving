import java.io.*;

public class Main {
    private static boolean isPossibleChannel(int channel, boolean[] brokenButtons) {
        if (channel == 0) {
            return !brokenButtons[0];
        }

        while (channel > 0) {
            int digit = channel % 10;
            if (brokenButtons[digit]) {
                return false;
            }
            channel /= 10;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int targetChannel = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] brokenButtons = new boolean[10];

        if (n > 0) {
            String[] brokenButtonArr = br.readLine().split(" ");
            for (String s : brokenButtonArr) {
                int brokenButton = Integer.parseInt(s);
                brokenButtons[brokenButton] = true;
            }
        }

        int minPress = Math.abs(targetChannel - 100);

        for (int i = 0; i <= 1000000; i++) {
            if (isPossibleChannel(i, brokenButtons)) {
                int press = Math.abs(targetChannel - i) + Integer.toString(i).length();
                minPress = Math.min(minPress, press);
            }
        }

        System.out.println(minPress);
    }
}