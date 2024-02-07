class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(arr[0]);
        
        for(String str : arr){
            int tmp = Integer.parseInt(str);
            
            if(min > tmp){
                min = tmp;
            } else if(max < tmp){
                max = tmp;
            }
        }
        
        return min + " " + max;
    }
}