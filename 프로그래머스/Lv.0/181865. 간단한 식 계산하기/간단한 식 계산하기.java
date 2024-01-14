class Solution {
    public int solution(String binomial) {
        String[] temp = binomial.split(" ");
        int answer;
        if(temp[1].equals("+"))
            answer = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
        else if(temp[1].equals("-"))
            answer = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
        else
            answer = Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        return answer;
    }
}