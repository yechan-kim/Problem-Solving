class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            char tmp = code.charAt(i);
            if(mode == 0){
                if(tmp == '1')
                    mode = 1;
                else if(i % 2 == 0)
                    answer += tmp;
            }         
            else if(mode == 1){
                if(tmp == '1')
                    mode = 0;
                else if(i % 2 == 1)
                    answer += tmp;
            }
        }
        if(answer.equals(""))
            return "EMPTY";
        else
            return answer;
    }
}