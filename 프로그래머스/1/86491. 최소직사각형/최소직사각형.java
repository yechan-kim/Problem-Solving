class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        for(int i=0; i<sizes.length; i++){
            if(x < sizes[i][0])
                x = sizes[i][0];
            if(y < sizes[i][1])
                y = sizes[i][1];
        }
        
        return x*y;
    }
}