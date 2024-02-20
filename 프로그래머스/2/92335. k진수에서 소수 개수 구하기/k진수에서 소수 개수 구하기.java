import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n,k);
        String[] temp = num.split("0");
        
        for(String s : temp){
            if(!s.isEmpty()){
                if(isPrime(s)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(String s){
        long num = Long.parseLong(s);
        
        if(num == 1L){
            return false;
        }
        
        for(long i=2L; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}