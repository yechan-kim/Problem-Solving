class Solution {
    public int solution(String name) {
        int length = name.length();
        int move = length - 1;
        int answer = 0;
        int index = 0;
        
        for(int i=0; i<length; i++){
            char tmp = name.charAt(i);
            answer += Math.min(tmp - 'A', 'Z' - tmp + 1);
            
            index = i + 1;
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }

            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }
        
        return answer + move;
    }
}