class Solution {
    public int solution(int n) {
        int binrayN = Integer.toBinaryString(n).length()-Integer.toBinaryString(n).replace("1","").length();
        while(true){
            n++;
            if(binrayN == Integer.toBinaryString(n).length()-Integer.toBinaryString(n).replace("1","").length()){
                return n;
            }
        }
    }
}