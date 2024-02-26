import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList<>();
        List<String> command = new ArrayList<>();
        List<String> id = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (String str : record) {
            String[] tmp = str.split(" ");
            command.add(tmp[0]);
            id.add(tmp[1]);
            if (tmp.length == 2) {
                continue;
            }
            map.put(tmp[1], tmp[2]);
        }

        for (int i = 0; i < command.size(); i++) {
            StringBuilder sb = new StringBuilder();

            String tmp = command.get(i);
            String userId = id.get(i);

            sb.append(map.get(userId)).append("님이 ");

            if (tmp.equals("Enter")) {
                sb.append("들어왔습니다.");
            } else if (tmp.equals("Leave")) {
                sb.append("나갔습니다.");
            } else {
                continue;
            }

            answer.add(sb.toString());
        }

        return answer;
    }
}
