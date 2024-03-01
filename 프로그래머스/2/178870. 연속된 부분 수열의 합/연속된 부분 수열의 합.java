class Solution {
    public int[] solution(int[] sequence, int k) {
        int size = sequence.length;
        int[] answer = {0, size - 1};
        int start = 0;
        int end = 1;
        int sum = sequence[0];
        
        while (start < end) {
            if (sum == k) {
                if (end - 1 - start < answer[1] - answer[0]) {
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                
                sum -= sequence[start++];
            } else if (sum > k) {
                sum -= sequence[start++];
            } else if (end < size) {
                sum += sequence[end++];
            } else {
                break;
            }
        }

        return answer;
    }
}