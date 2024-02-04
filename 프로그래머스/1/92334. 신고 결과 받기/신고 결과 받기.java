import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> reportMap = new HashMap<>();
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        for (String str : uniqueReports) {
            String[] temp = str.split(" ");
            countMap.put(temp[1], countMap.getOrDefault(temp[1], 0) + 1);
        }

        for (String str : uniqueReports) {
            String[] temp = str.split(" ");
            if (countMap.get(temp[1]) >= k) {
                reportMap.put(temp[0], reportMap.getOrDefault(temp[0], 0) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}