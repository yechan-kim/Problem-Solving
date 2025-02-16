class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = adjustToSkipOp(pos, op_start, op_end);

        for (String cmd : commands) {
            switch (cmd) {
                case "prev":
                    answer = adjustToSkipOp(
                        intToString(Math.max(stringToInt(answer) - 10, 0)),
                        op_start,
                        op_end
                    );
                    break;

                case "next":
                    answer = adjustToSkipOp(
                        intToString(Math.min(stringToInt(answer) + 10, stringToInt(video_len))),
                        op_start,
                        op_end
                    );
                    break;
            }
        }

        return answer;
    }
    
    private String adjustToSkipOp(String now, String opStart, String opEnd) {
        return (now.compareTo(opStart) >= 0 && now.compareTo(opEnd) < 0) ? opEnd : now;
    }
    
    private int stringToInt(String str) {
        String[] arr = str.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }

    private String intToString(int i) {
        return String.format("%02d:%02d", i / 60, i % 60);
    }
}
