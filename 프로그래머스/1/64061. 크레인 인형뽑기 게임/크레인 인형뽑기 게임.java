import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] Y = new int[board.length];
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    Y[j]++;
                }
            }
        }

        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;

            if (Y[column] >= 0 && Y[column] < board.length) {
                int currentCell = board[Y[column]][column];

                if (currentCell == 0) {
                    continue;
                }

                int lastElement = list.get(list.size() - 1);

                if (lastElement == currentCell) {
                    answer += 2;
                    list.remove(list.size() - 1);
                } else {
                    list.add(currentCell);
                }

                Y[column]++;
            }
        }

        return answer;
    }
}