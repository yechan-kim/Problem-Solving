import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] arr = new int[10];

        for (int i = 0; i < Y.length(); i++) {
            int n = Y.charAt(i) - '0';
            arr[n]++;
        }

        int zero = arr[0];

        for (int i = 0; i < X.length(); i++) {
            int n = X.charAt(i) - '0';

            if (arr[n] > 0) {
                arr[n]--;
                answer.append(n);
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }

        if (answer.length() == zero) {
            return "0";
        }

        char[] strArr = answer.toString().toCharArray();
        Arrays.sort(strArr);
        answer.setLength(0);

        for (int i = strArr.length - 1; i >= 0; i--) {
            answer.append(strArr[i]);
        }

        return answer.toString();
    }
}