import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(int[] stones, int k) {
        // Deque는 슬라이딩 윈도우 내에서 가장 큰 값을 효율적으로 추적하기 위해 사용
        Deque<Integer> deque = new LinkedList<>();
        
        // 윈도우 내 최소값을 추적할 변수, 처음에는 최대값으로 설정
        int min = Integer.MAX_VALUE;
        
        // stones 배열을 순회하며 슬라이딩 윈도우를 구축
        for (int i = 0; i < stones.length; i++) {
            // 현재 슬라이딩 윈도우에서 벗어난 요소가 있으면 제거 (i - k 범위)
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst(); // 윈도우 범위 밖의 값 제거
            }
            
            // 덱의 마지막 값이 현재 값보다 작으면 제거하여 덱을 내림차순으로 유지
            while (!deque.isEmpty() && stones[deque.peekLast()] <= stones[i]) {
                deque.pollLast(); // 덱의 끝에서부터 값 제거
            }
            
            // 현재 인덱스를 덱의 끝에 추가
            deque.offerLast(i);
            
            // 슬라이딩 윈도우가 k 크기에 도달한 시점부터 최소값을 업데이트
            if (i >= k - 1) {
                min = Math.min(min, stones[deque.peekFirst()]);
            }
        }
        
        // 슬라이딩 윈도우를 모두 처리한 후 최종 최소값 반환
        return min;
    }
}