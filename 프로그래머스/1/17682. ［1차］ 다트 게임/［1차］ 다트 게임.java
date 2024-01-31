import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];

        int n = 0,idx = 0;
        String num = "";
        
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(c>='0' && c<='9'){       
                 num += c;
            } else if(c=='S' || c=='D' || c=='T'){
                n = Integer.parseInt(num);
                
                if(c=='S'){
                   arr[idx++] = n;
                } else if(c=='D'){
                    arr[idx++] = (int)Math.pow(n,2);
                } else{
                    arr[idx++] = (int)Math.pow(n,3);
                }
                
                num="";
            } else {
                if(c=='*'){
                    arr[idx-1] *= 2;
                    if(idx-2 >= 0)
                        arr[idx-2] *= 2; 
                } else {
                arr[idx-1] *= (-1);
                }
            }
        }
    
        answer = Arrays.stream(arr).sum();
    
        return answer;
    }
}