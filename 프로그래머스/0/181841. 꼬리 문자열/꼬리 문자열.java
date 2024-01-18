class Solution {
    boolean check(String my_string, String target){
        for(int i=0; i<my_string.length()-target.length()+1; i++){
            if(my_string.charAt(i) == target.charAt(0)){
                int cnt = 1;
                for(int j=1; j<target.length(); j++){
                    if(my_string.charAt(i+j) == target.charAt(j))
                        cnt++;
                    else
                        break;
                }
                if(cnt == target.length())
                    return false;
            }
        }
        return true;
    }
    
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i=0; i<str_list.length; i++){
            if(check(str_list[i],ex))
                answer += str_list[i];
        }
        
        return answer;
    }
}