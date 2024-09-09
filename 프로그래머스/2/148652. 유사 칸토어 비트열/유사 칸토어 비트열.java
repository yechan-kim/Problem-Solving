class Solution {
    public int solution(int n, long l, long r) {
        return dfs(n, l, r, 1);
    }
    
    public int dfs(int n, long s, long e, long index) {
        if(n == 0) return 1;
        
        int num = 0;
        
        long part = (long)Math.pow(5, n-1);
        
        for(int i=0 ; i<5 ; i++) {
            if(i == 2 || e < (index + part * i) || (index + part * (i + 1) - 1) < s) continue;  
            
            num += dfs(n-1, s, e, index + part * i);
        }
        
        return num;
    }
}