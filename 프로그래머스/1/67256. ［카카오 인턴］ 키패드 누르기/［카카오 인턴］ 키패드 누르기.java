class Solution {
    public int[][] pad = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {(int)'*',0,(int)'#'}};
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] locationR = {3,2};
        int[] locationL = {3,0};
        
        for(int num : numbers){
            if(num == 1 || num == 4 || num == 7){
                answer+="L";
                locationL = location(num);
            } else if(num == 3 || num == 6 || num == 9){
                answer+="R";
                locationR = location(num);
            } else{
                if(distance(num,locationL) > distance(num,locationR)){
                    answer+="R";
                    locationR = location(num);
                } else if(distance(num,locationL) < distance(num,locationR)){
                    answer+="L";
                    locationL = location(num);
                } else{
                    if(hand.equals("right")){
                        answer+="R";
                        locationR = location(num);
                    } else{
                        answer+="L";
                        locationL = location(num);
                    }
                }
            }
        }
        
        return answer;
    }
    
    public int[] location(int num){
        int[] loc =new int[2];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(num == pad[i][j]){
                    loc[0]=i;
                    loc[1]=j;
                }
            }
        }
        
        return loc;
    }
    
    public int distance(int num, int[] loc){
        int[] tmp = location(num);
        
        return Math.abs(loc[1]-tmp[1]) + Math.abs(loc[0]-tmp[0]);
    }
}