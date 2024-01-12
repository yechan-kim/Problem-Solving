class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i = myString.length() - 1; i >= 0; i--){
            if(myString.charAt(i) == pat.charAt(pat.length()-1)){
                int cnt = 0;
                for(int j = 0; j < pat.length(); j++){
                    if(myString.charAt(i - pat.length() + 1 + j) == pat.charAt(j))
                        cnt++;
                }
                if(cnt == pat.length()){
                    for(int j = 0; j <= i; j++)
                        answer += myString.charAt(j);
                    break;
                }
            }
        }
        return answer;
    }
}