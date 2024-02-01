class Solution {
    public int solution(String s) {
        int answer = 0, mainCnt = 0, cnt = 0;
         char main = s.charAt(0);
        
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            
            if(temp == main){
                mainCnt++;
            }else{
                cnt++;
            }
            
            if(cnt == mainCnt){
                answer++;
                
                if(i < s.length()){
                    cnt = 0;
                    mainCnt = 0;
                }
                
                if(i < s.length() - 1){
                    main = s.charAt(i + 1);
                }
            }
        }
        
        if(cnt != 0 ||  mainCnt != 0)
            answer++;
        
        return answer;
    }
}