class Solution {
    public int solution(int storey) {
        int answer = 0;
        String[] c = String.valueOf(storey).split("");
        int size = c.length;
        int[] arr = new int[size];
        
        
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(c[i]);
        }
        
        for(int i=size-1; i>0; i--){
            if(arr[i] > 5){
                arr[i-1]++;
                answer += 10 - arr[i];
            } else if(arr[i] == 5 && arr[i-1] >= 5) {
                arr[i-1]++;
                answer += 10 - arr[i];
            } else {
                answer += arr[i];
            }
        }
        
        if(arr[0]>5){
            answer += 11 - arr[0];
        } else {
            answer += arr[0];
        }
        
        return answer;
    }
}