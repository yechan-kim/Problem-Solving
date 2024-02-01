import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : participant) {
            int count = map.getOrDefault(name, 0);
            
            if (count == 0) {
                return name;
            } else {
                map.put(name, count - 1);
            }
        }

        return null;
    }
}