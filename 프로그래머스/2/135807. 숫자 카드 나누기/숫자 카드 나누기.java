import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int max = Math.max(Arrays.stream(arrayA).max().getAsInt(),
                           Arrays.stream(arrayB).max().getAsInt());
       
        for(int i=max; i>1; i--){
            if(isDivision(arrayA, i)) {
                if(isNotDivision(arrayB, i)) return i;
            } else if(isDivision(arrayB, i)) {
                if(isNotDivision(arrayA, i)) return i;
            }
        }

        return 0;
    }
    
    public boolean isDivision(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] % n != 0) return false;
        }
        
        return true;
    }

    public boolean isNotDivision(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] % n == 0) return false;
        }
        
        return true;
    }
}