class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");

        for (String str : temp) {
            if(str.isEmpty()){
                answer += " ";
            } else{
                if (Character.isDigit(str.charAt(0))) {
                answer += str.charAt(0);
                } else {
                    answer += str.toUpperCase().charAt(0);
                }

                answer += str.toLowerCase().substring(1) + " ";
            }
        }
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                break;
            } else{
                answer += ' ';
            }
        }

        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }
}