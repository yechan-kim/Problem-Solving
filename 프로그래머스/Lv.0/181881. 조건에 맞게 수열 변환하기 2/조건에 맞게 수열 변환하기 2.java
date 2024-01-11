class Solution {
    public int solution(int[] arr) {
        int[] temp = new int[arr.length];
        int answer = 0;
        
        while(true){
            int count = 0;
            
            for(int i=0; i<arr.length; i++){
                temp[i] = arr[i];
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                    arr[i] /= 2;
                else if(arr[i] < 50 && arr[i] % 2 != 0)
                    arr[i] = arr[i] * 2 + 1;
                if(arr[i] == temp[i])
                    count++;
            }
            
            answer++;
            
            if(count == arr.length)
                return answer - 1;
        }
    }
}