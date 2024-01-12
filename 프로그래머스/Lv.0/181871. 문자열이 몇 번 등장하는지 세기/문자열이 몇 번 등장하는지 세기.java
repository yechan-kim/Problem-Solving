class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            if(myString.charAt(i)==pat.charAt(0)){
                int cnt=1;
                for(int j=1; j<pat.length(); j++){
                    if(myString.charAt(i+j) == pat.charAt(j))
                        cnt++;
                }
                if(cnt == pat.length())
                    answer++;
            }
        }
        return answer;
    }
}