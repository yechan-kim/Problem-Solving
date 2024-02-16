class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1L)];
        
        for(int i=0; i<(int)(right - left + 1L); i++){
            if((left+i) / n < (left+i) % n){
                answer[i]= (int)((left+i) % n) + 1;
            } else{
                answer[i] = (int)((left+i) / n) + 1;
            }
        }
        
        return answer;
    }
}