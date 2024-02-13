import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for (int num : list) {
            if (sum + num >= k) {
                cnt++;
                break;
            } else {
                sum += num;
                cnt++;
            }
        }
        
        return cnt;
    }
}