public class Solution {
    static final long MAX = (long) (10e9 * 2 * 10e5 * 2); // 최대 경과 시간

    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = MAX;

        int cityCount = g.length;
        long start = 0;
        long end = MAX;

        while (start <= end) {
            long mid = (start + end) / 2;
            int gold = 0;
            int silver = 0;
            int add = 0;

            for (int i = 0; i < cityCount; i++) {
                int goldAmount = g[i];
                int silverAmount = s[i];
                int weight = w[i];
                long time = t[i];

                long moveCount = mid / (time * 2);
                
                if (mid % (time * 2) >= t[i]) {
                    moveCount++;
                }

                gold += (int) Math.min(goldAmount, moveCount * weight);
                silver += (int) Math.min(silverAmount, moveCount * weight);
                add += (int) Math.min(goldAmount + silverAmount, moveCount * weight);
            }

            if (a <= gold && b <= silver && a + b <= add) {
                end = mid - 1;
                answer = Math.min(mid, answer);
                
                continue;
            }

            start = mid + 1;
        }

        return answer;
    }
}