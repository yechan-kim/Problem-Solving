class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=3; i<=n; i++){
            if(prime(i)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean prime(int n){
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        
        return true;
    }
}