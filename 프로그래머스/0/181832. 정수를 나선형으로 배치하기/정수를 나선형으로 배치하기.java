class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i = 0;
        int j = 0;
        int cnt = 1;

        while (cnt <= n * n) {
            while (j < n && answer[i][j] == 0) {
                answer[i][j] = cnt;
                cnt++;
                j++;
            }
            j--;
            
            i++;
            while (i < n && answer[i][j] == 0) {
                answer[i][j] = cnt;
                cnt++;
                i++;
            }
            i--;
            
            j--;
            while (j >= 0 && answer[i][j] == 0) {
                answer[i][j] = cnt;
                cnt++;
                j--;
            }
            j++;

            i--;
            while (i >= 0 && answer[i][j] == 0) {
                answer[i][j] = cnt;
                cnt++;
                i--;
            }
            i++;
            
            if (cnt <= n * n)
                j++;
        }
        return answer;
    }
}