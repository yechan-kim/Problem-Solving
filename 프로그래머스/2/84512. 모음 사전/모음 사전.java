class Solution {
    public int solution(String word) {
        int[] arr = {781, 156, 31, 6 , 1};
        int answer = word.length();
        String str= "AEIOU";
        
        for(int i=0; i<word.length(); i++){
            answer += arr[i] * str.indexOf(word.charAt(i));
        }
        
        return answer;
    }
}