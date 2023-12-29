class Solution {
    public int solution(int a, int b) {
        String s_a = Integer.toString(a);
        String s_b = Integer.toString(b);
        String s_r = s_a + s_b;
        int r = Integer.parseInt(s_r);
        int answer = Math.max(r, 2 * a * b);
        return answer;
    }
}