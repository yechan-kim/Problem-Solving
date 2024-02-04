import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        List<String> list = Arrays.asList(friends);
        int[][] gift = new int[friends.length][friends.length];
        int[] giftScore = new int[friends.length];
        int[] nextGift = new int[friends.length];
        boolean[][] valid = new boolean[friends.length][friends.length];

        for (String str : gifts) {
            String tmp[] = str.split(" ");
            gift[list.indexOf(tmp[0])][list.indexOf(tmp[1])]++;
        }

        for (int i = 0; i < friends.length; i++) {
            giftScore[i] = Arrays.stream(gift[i]).sum();
            for (int j = 0; j < friends.length; j++) {
                giftScore[i] -= gift[j][i];
            }
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (i != j && !valid[j][i]) {
                    if (gift[i][j] > gift[j][i]) {
                        nextGift[i]++;
                    } else if (gift[i][j] < gift[j][i]) {
                        nextGift[j]++;
                    } else {
                        if (giftScore[i] == giftScore[j]) {
                            valid[i][j] = true;
                            continue;
                        } else if (giftScore[i] > giftScore[j]) {
                            nextGift[i]++;
                        } else {
                            nextGift[j]++;
                        }
                    }
                    valid[i][j] = true;
                }
            }
        }

        return Arrays.stream(nextGift).max().getAsInt();
    }
}
