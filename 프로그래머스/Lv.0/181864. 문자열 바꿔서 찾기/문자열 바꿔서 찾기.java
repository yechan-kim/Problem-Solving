class Solution {
    public int solution(String myString, String pat) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A')
                newString.append('B');
            else
                newString.append('A');
        }

        for (int i = 0; i < newString.length(); i++) {
            if (i + pat.length() <= newString.length() && newString.charAt(i) == pat.charAt(0)) {
                int cnt = 1;
                for (int j = 1; j < pat.length(); j++) {
                    if (newString.charAt(i + j) == pat.charAt(j))
                        cnt++;
                    else
                        break;
                }
                if (cnt == pat.length())
                    return 1;
            }
        }
        return 0;
    }
}