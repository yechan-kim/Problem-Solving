import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        List<Integer> validNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            validNumbers.add(i);
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
                for (int num : q[i]) {
                    validNumbers.remove(Integer.valueOf(num));
                }
            }
        }

        return dfs(validNumbers, q, ans, new ArrayList<>(), 5, 0);
    }

    private int dfs(List<Integer> validNumbers, int[][] q, int[] ans, List<Integer> current, int r, int start) {
        if (current.size() == r) {
            if (isValid(current, q, ans)) {
                return 1;
            }
            return 0;
        }

        int count = 0;

        for (int i = start; i < validNumbers.size(); i++) {
            current.add(validNumbers.get(i));

            count += dfs(validNumbers, q, ans, current, r, i + 1);

            current.remove(current.size() - 1);
        }

        return count;
    }

    private boolean isValid(List<Integer> combination, int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            int cnt = 0;

            for (int num : q[i]) {
                if (combination.contains(num)) {
                    cnt++;
                }
            }

            if (cnt != ans[i]) {
                return false;
            }
        }
        
        return true;
    }
}
