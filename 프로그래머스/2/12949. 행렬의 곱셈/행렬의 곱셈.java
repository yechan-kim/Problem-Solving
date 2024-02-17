class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                answer[i][j] = result(arr1, arr2, i, j);
            }
        }

        return answer;
    }
    
    public int result (int[][] arr1, int[][] arr2, int x, int y) {
        int i = 0, sum = 0;
        
        while(i < arr1[0].length && i < arr2.length){
            sum += arr1[x][i] * arr2[i][y];
            i++;
        }
        
        return sum;
    }
}