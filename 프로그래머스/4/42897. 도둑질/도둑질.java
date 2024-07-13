class Solution {
    public int solution(int[] money) {
        int size = money.length;
        
        int[] dp1 = new int[size];
        int[] dp2 = new int[size];

        dp1[0] = money[0];
        dp1[1] = money[0];

        dp2[0] = 0;
        dp2[1] = money[1];

        for (int i = 2; i < size; i++) {
            dp1[i] = Math.max(dp1[i - 1], money[i] + dp1[i - 2]);
            dp2[i] = Math.max(dp2[i - 1], money[i] + dp2[i - 2]);
        }

        return Math.max(dp1[size - 2], dp2[size - 1]);
    }
}