class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int parkWidth = park[0].length;

        for (int mat : mats) {
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < parkWidth; j++) {
                    if (park[i][j].equals("-1") && isValid(i, j, mat, park)) {
                        answer = Math.max(answer, mat);
                    }
                }
            }
        }

        return answer;
    }

    private boolean isValid(int startX, int startY, int size, String[][] park) {
        int endX = startX + size - 1;
        int endY = startY + size - 1;

        if (endX >= park.length || endY >= park[0].length) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!park[startX + i][startY + j].equals("-1")) {
                    return false;
                }
            }
        }

        return true;
    }
}
