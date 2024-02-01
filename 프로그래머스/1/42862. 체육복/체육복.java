import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        int answer = n - lost.length;
        int cnt1 = 0;
        int cnt2 = 0;
        
        for (int i = 0; i < lost.length; i++) {
            if (reserveList.contains(lost[i])) {
                reserveList.remove(reserveList.indexOf(lost[i]));
                lostList.remove(lostList.indexOf(lost[i]));
                answer++;
            }
        }
        
        lost = lostList.stream().mapToInt(Integer::intValue).toArray();
        
        List<Integer> reserveList1 = new ArrayList<>(reserveList);
        
        for (int i = 0; i < lost.length; i++) {
             if (reserveList1.contains(lost[i] - 1)) {
                reserveList1.remove(reserveList1.indexOf(lost[i] - 1));
                cnt1++;
            } else if (reserveList1.contains(lost[i] + 1)) {
                reserveList1.remove(reserveList1.indexOf(lost[i] + 1));
                cnt1++;
            }
        }
        
        List<Integer> reserveList2 = new ArrayList<>(reserveList);
        
        for (int i = lost.length - 1; i >= 0; i--) {
             if (reserveList2.contains(lost[i] - 1)) {
                reserveList2.remove(reserveList2.indexOf(lost[i] - 1));
                cnt2++;
            } else if (reserveList2.contains(lost[i] + 1)) {
                reserveList2.remove(reserveList2.indexOf(lost[i] + 1));
                cnt2++;
            }
        }

        return answer + Math.max(cnt1,cnt2);
    }
}