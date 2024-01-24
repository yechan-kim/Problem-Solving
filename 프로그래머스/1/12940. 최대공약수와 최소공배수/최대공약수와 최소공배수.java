class Solution {
    public long[] solution(int n, int m) {
        long[] answer = new long[2];
        
        for(int i=1; i<=Math.min(n,m); i++)
            if(n % i == 0 && m % i == 0)
                answer[0] = i;
        
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}