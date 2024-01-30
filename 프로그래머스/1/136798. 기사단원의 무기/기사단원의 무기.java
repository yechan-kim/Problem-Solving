class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=0; i<number; i++){
            answer += div(i+1, limit, power);
        }
        
        return answer;
    }
    
    public int div(int num, int limit, int power) {
        int cnt = 0;
        
        for(int i=1; i*i<=num; i++){
            if(i*i==num){
                cnt++;
            } else if(num%i==0){
                cnt+=2;
            }
            
            if(cnt >limit){
                return power;
            }
        }
        
        return cnt;
    }
}