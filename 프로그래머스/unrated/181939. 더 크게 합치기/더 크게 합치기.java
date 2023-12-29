class Solution {
    public int solution(int a, int b) {
        String s_a = Integer.toString(a);
        String s_b = Integer.toString(b);
        String s_r1 = s_a + s_b;
        String s_r2 = s_b + s_a;
        int r1 = Integer.parseInt(s_r1);
        int r2 = Integer.parseInt(s_r2);
        int answer = Math.max(r1, r2);
        return answer;
    }
}