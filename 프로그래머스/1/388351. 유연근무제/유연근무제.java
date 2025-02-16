class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        
        for(int i=0; i<timelogs.length; i++){
            for(int j=0; j<timelogs[i].length; j++){
                if(startday + j == 6 || startday + j == 7 || startday + j == 13) continue;
                
                if(convert(timelogs[i][j]) > convert(schedules[i] + 10)){
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    private int convert(int time) {
        if(time >= 2400){
            time -= 2400;
        }
        
        return time / 100 * 60 + time % 100;
    }
}