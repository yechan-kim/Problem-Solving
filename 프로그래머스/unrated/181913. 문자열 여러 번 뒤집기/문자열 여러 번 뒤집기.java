class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            String temp = "";
            for(int j = 0; j < queries[i][0]; j++)
                temp += my_string.charAt(j);
            for(int j = queries[i][1]; j >= queries[i][0]; j--)
                temp += my_string.charAt(j);
            for(int j = queries[i][1] + 1; j < my_string.length(); j++)
                temp += my_string.charAt(j);
            my_string = temp;
        }
        return my_string;
    }
}