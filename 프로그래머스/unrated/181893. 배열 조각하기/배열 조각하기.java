import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            list.add(arr[i]);

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                int temp = list.size();
                for (int j = query[i] + 1; j < temp; j++)
                    list.remove(query[i] + 1);
            } else {
                for (int j = 0; j < query[i]; j++)
                    list.remove(0);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}