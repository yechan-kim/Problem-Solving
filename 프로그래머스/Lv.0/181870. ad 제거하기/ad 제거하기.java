import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {

        List<String> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }

        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}