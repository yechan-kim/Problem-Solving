class Solution {
    public long solution(String s) {
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar >= '0' && currentChar <= '9') {
                temp += currentChar;
            } else if (currentChar == 'o' && i + 2 < s.length() && s.substring(i, i + 3).equals("one")) {
                temp += '1';
                i += 2;
            } else if (currentChar == 't') {
                if (i + 4 < s.length() && s.substring(i, i + 5).equals("three")) {
                    temp += '3';
                    i += 4;
                } else if (i + 2 < s.length() && s.substring(i, i + 3).equals("two")) {
                    temp += '2';
                    i += 2;
                }
            } else if (currentChar == 'f') {
                if (i + 3 < s.length() && s.substring(i, i + 4).equals("four")) {
                    temp += '4';
                    i += 3;
                } else if (i + 3 < s.length() && s.substring(i, i + 4).equals("five")) {
                    temp += '5';
                    i += 3;
                }
            } else if (currentChar == 's') {
                if (i + 4 < s.length() && s.substring(i, i + 5).equals("seven")) {
                    temp += '7';
                    i += 4;
                } else if (i + 2 < s.length() && s.substring(i, i + 3).equals("six")) {
                    temp += '6';
                    i += 2;
                }
            } else if (currentChar == 'e' && i + 4 < s.length() && s.substring(i, i + 5).equals("eight")) {
                temp += '8';
                i += 4;
            } else if (currentChar == 'n' && i + 3 < s.length() && s.substring(i, i + 4).equals("nine")) {
                temp += '9';
                i += 3;
            } else if (currentChar == 'z' && i + 3 < s.length() && s.substring(i, i + 4).equals("zero")) {
                temp += '0';
                i += 3;
            }
        }

        long answer = Long.parseLong(temp);
        return answer;
    }
}
