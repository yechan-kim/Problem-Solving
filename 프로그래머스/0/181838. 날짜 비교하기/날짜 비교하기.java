class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0]*10000 + date1[1]*100 + date1[2] < date2[0]*10000 + date2[1]*100 + date2[2])
            return 1;
        else
            return 0;
    }
}