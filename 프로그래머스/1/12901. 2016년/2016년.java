class Solution {
    public String solution(int a, int b) {
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int temp = b;
        
        for(int i=0; i<a-1; i++){
            temp += date[i];
        }
        
        return day[temp % 7];
    }
}