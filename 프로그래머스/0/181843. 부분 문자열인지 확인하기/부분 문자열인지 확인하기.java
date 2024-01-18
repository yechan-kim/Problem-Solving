class Solution {
    public int solution(String my_string, String target) {
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
                    return 1;
            }
        }
        return 0;
    }
}