import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int[] cnt = new int[targets[i].length()];
            Arrays.fill(cnt, Integer.MAX_VALUE);
            
            for (int j = 0; j < targets[i].length(); j++) {
                char temp = targets[i].charAt(j);
    
                for (int k = 0; k < keymap.length; k++) {
                    for (int l = 0; l < keymap[k].length(); l++) {
                        if (temp == keymap[k].charAt(l)) {
                            cnt[j] = Math.min(cnt[j], l + 1);
                            break;
                        }
                    }
                }
                
                if (cnt[j] == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += cnt[j];
            }
        }
        
        return answer;
    }
}
