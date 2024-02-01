import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        int answer = n - lost.length;
        
        for (int i = 0; i < lost.length; i++) {
            if (reserveList.contains(lost[i])) {
                reserveList.remove(reserveList.indexOf(lost[i]));
                lostList.remove(lostList.indexOf(lost[i]));
                answer++;
            }
        }
        
        lost = lostList.stream().mapToInt(Integer::intValue).toArray();
        
        for (int i = 0; i < lost.length; i++) {
             if (reserveList.contains(lost[i] - 1)) {
                reserveList.remove(reserveList.indexOf(lost[i] - 1));
                answer++;
            } else if (reserveList.contains(lost[i] + 1)) {
                reserveList.remove(reserveList.indexOf(lost[i] + 1));
                answer++;
            }
        }

        return answer;
    }
}