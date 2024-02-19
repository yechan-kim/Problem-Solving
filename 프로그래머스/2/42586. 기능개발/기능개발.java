import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int len = progresses.length;
        int point = 0;
        
        while (point < len) {
            int cnt = 0;

            while (point < len && progresses[point] >= 100) {
                point++;
                cnt++;
            }

            if (cnt > 0) {
                answer.add(cnt);
            }

            for (int i = 0; i < len; i++) {
                progresses[i] += speeds[i];
            }
        }

        return answer;
    }
}