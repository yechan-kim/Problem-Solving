class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            for (int j = 0; j < index; j++) {
                temp++;
                
                if (temp > 'z') {
                    temp -= 26;
                }
                
                if(skip.contains(String.valueOf(temp)))
                   j--;
            }

            answer.append(temp);
        }

        return answer.toString();
    }
}