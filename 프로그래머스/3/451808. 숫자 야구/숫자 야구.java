import java.util.function.Function;
import java.util.*;

class Solution {
    public int solution(int n, Function<Integer, String> submit) {
        List<String> list = new ArrayList<>();
        insertAllCase(list);

        while (list.size() != 1) {
            String num = list.get(0);
            String result = submit.apply(Integer.parseInt(num));
            list = filterList(list, num, result.charAt(0) - '0', result.charAt(3) - '0');
        }

        return Integer.parseInt(list.get(0));
    }

    private void insertAllCase(List<String> list) {
        for (int a = 1; a <= 9; a++) {

            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;

                for (int c = 1; c <= 9; c++) {
                    if (a == c || b == c) continue;

                    for (int d = 1; d <= 9; d++) {
                        if (a == d || b == d || c == d) continue;

                        list.add((1000 * a + 100 * b + 10 * c + d) + "");
                    }
                }
            }
        }
    }

    private List<String> filterList(List<String> list, String command, int strike, int ball) {
        List<String> newList = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        set.add(command.charAt(0));
        set.add(command.charAt(1));
        set.add(command.charAt(2));
        set.add(command.charAt(3));

        for (String num : list) {
            int strikeCnt = 0;
            int ballCnt = 0;

            for (int i = 0; i < 4; i++) {
                if (command.charAt(i) == num.charAt(i)) {
                    strikeCnt++;
                    continue;
                }

                if (set.contains(num.charAt(i))) {
                    ballCnt++;
                }
            }

            if (strikeCnt == strike && ballCnt == ball) {
                newList.add(num);
            }
        }

        return newList;
    }
}
