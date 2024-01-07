class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for(int i=0; i< my_string.length(); i++){
            for(int j=0; j<indices.length; j++){
                if(i == indices[j])
                    break;
                else if(j == indices.length - 1)
                    answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}