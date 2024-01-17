class Solution {
    public long solution(long n) {
        double sol = Math.sqrt(n);
        long sol2 = (long)sol;
        
        if(sol - sol2 == 0)
            return (sol2+(long)1)*(sol2+(long)1);
        else
            return (long)-1;
    }
}