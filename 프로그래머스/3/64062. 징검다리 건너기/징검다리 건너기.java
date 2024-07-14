import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(int[] stones, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < stones.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            while (!deque.isEmpty() && stones[deque.peekLast()] <= stones[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i);
            
            if (i >= k - 1) {
                min = Math.min(min, stones[deque.peekFirst()]);
            }
        }
        
        return min;
    }
}