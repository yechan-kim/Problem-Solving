class Solution {
    public int solution(int n) {
        String input = Integer.toString(n, 3);
        String ans = ""; 
        
        for (int i = input.length() - 1; i >= 0; i--)
            ans += input.charAt(i);
        
        int answer = Integer.parseInt(ans, 3);
        return answer;
    }
}