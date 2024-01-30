import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        int idx1 = 0, idx2 = 0, idx3 = 0;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length;i++){
            if(answers[i] == user1[idx1])
                cnt1++;
            if(answers[i] == user2[idx2])
                cnt2++;
            if(answers[i] == user3[idx3])
                cnt3++;
            
            idx1 = (idx1+1) % 5;
            idx2 = (idx2+1) % 8;
            idx3 = (idx3+1) % 10;
        }
        
        int max = Math.max(cnt1,Math.max(cnt2,cnt3));
        
        if(cnt1 == max)
            list.add(1);
        if(cnt2 == max)
            list.add(2);
        if(cnt3 == max)
            list.add(3);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}