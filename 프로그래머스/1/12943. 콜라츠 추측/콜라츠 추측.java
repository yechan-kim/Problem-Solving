class Solution {
    public int solution(int num) {
        if(num == 1)
            return 0;
        
        for(int i=1; i<=300; i++){
            if(num % 2 == 0)
                num /= 2;
            
            else
                num = 3 * num + 1;
            
            if(num == 1)
                return i;
        }
        
        return -1;
    }
}