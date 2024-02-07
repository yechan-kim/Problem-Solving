class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int cnt = s.length() - s.replaceAll("0", "").length();
            answer[1] += cnt;
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
            answer[0]++;
        }
        
        return answer;
    }
}