import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        ArrayList<Integer> store = new ArrayList<>();
        
        for (int i = 1; i < w * 2; i += 2) {
            store.add(i);
        }

        store.sort(Collections.reverseOrder());

        int floor = num / w - (num % w == 0 ? 1 : 0);
        int nextNum = num;
        
        while (nextNum <= n) {
            int addNum = (nextNum % w == 0) ? w : nextNum % w;
            
            nextNum += store.get(addNum - 1);
            
            answer++;
            floor++;
        }

        return answer;
    }
}
