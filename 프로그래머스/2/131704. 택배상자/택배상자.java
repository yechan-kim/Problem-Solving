import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int now = 1;

        for (int i = 0; i < order.length; i++) {
            if (order[i] == now) {
                answer++;
                now++;
            } else {
                if (!stack.isEmpty() && stack.peek() == order[i]) {
                    stack.pop();
                    answer++;
                } else if(now > order.length && stack.peek() != order[i]) {
                    break;
                } else {
                    stack.push(now);
                    now++;
                    i--;
                }
            }

            if (now > order.length && stack.isEmpty()) {
                break;
            }
        }

        return answer;
    }
}