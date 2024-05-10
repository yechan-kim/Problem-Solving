class Solution {
    public int solution(int[][] triangle) {
        int size = triangle.length;
        int[][] dp = new int[size][size];

        for (int i = 0; i < size; i++) {
            dp[size - 1][i] = triangle[size - 1][i];
        }
        
       return findMax(triangle, dp, 0, 0); 
    }
    
    public int findMax(int[][] triangle, int[][] dp, int depth, int idx) {
        if (depth == triangle.length - 1) {
            return dp[depth][idx];
        }

        if (dp[depth][idx] == 0) {
            dp[depth][idx] = Math.max(findMax(triangle, dp, depth + 1, idx), findMax(triangle, dp, depth + 1, idx + 1)) + triangle[depth][idx];
        }

        return dp[depth][idx];
    }
}