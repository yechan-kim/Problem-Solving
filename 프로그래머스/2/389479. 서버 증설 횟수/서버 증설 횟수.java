class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] server = new int[24];
        
        for(int i=0; i<24; i++) {
            int needServer = 0;
            int serverCount = 0;
            
            if(players[i] >= m) {
                needServer += (players[i] - m) / m + 1;
            }
            
            for(int j=Math.max(0, i - k + 1); j<i; j++) {
                serverCount += server[j];
            }
            
            int addServerCnt = Math.max(0, needServer - serverCount);
            server[i] = addServerCnt;
            answer += addServerCnt;
        }
        
        return answer;
    }
}