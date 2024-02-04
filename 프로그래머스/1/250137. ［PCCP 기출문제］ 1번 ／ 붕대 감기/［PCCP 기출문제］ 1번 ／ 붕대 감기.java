class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0;
        int cnt = 0;
        int max = health;
        
        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            if(i == attacks[idx][0]){
                health -= attacks[idx][1];
                cnt = 0;
                idx++;
            } else if(health < 0){
                return -1;
            } else if(max > health){
                health += bandage[1];
                cnt++;
                
                if(max == health){
                    cnt = 0;
                    continue;
                } else if(cnt == bandage[0]){
                    health += bandage[2];
                    cnt = 0;
                }
                
                if(max < health){
                    health = max;
                }
            }
        }
        
        if(health > 0){
            return health;
        } else{
            return -1;
        }
    }
}