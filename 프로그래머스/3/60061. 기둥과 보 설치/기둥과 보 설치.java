import java.util.*;

class Solution {
    static int size;
    static boolean[][] columns;
    static boolean[][] beams;

    public int[][] solution(int n, int[][] build_frame) {
        size = n;
        int[][] answer;
        columns = new boolean[size + 3][size + 3];
        beams = new boolean[size + 3][size + 3];

        for (int[] frame : build_frame) {
            int x = frame[0] + 1; // 범위를 벗어난 경우를 쉽게 처리하기 위해 1씩 인덱스를 높여 저장
            int y = frame[1] + 1;
            int a = frame[2];
            int b = frame[3];

            // 삭제
            if (b == 0) delete(x, y, a);

            // 설치
            else create(x, y, a);
        }

        // 정답 계산
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i <= size + 1; ++i) {
            for (int j = 1; j <= size + 1; ++j) {
                if (columns[i][j]) list.add(new int[]{i - 1, j - 1, 0}); // 1 높인 인덱스 다시 줄여줌

                if (beams[i][j]) list.add(new int[]{i - 1, j - 1, 1});
            }
        }

        answer = new int[list.size()][3];

        for (int i = 0; i < answer.length; i++) {
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
            answer[i][2] = list.get(i)[2];
        }

        return answer;
    }

    // 설치
    public static void create(int x, int y, int a) {
        // 기둥
        if (a == 0) {
            if (canColumn(x, y)) columns[x][y] = true;
        }

        // 보
        else {
            if (canBeam(x, y)) beams[x][y] = true;
        }
    }

    // 삭제
    public static void delete(int x, int y, int a) {
        // 일단 삭제
        // 기둥
		if(a == 0) columns[x][y] = false;
        
        // 보
        else beams[x][y] = false;

		// 삭제 후 남은 기둥과 보가 요건에 충족하지 않으면 원상태로 복구
		if(canNotDelete(x, y)) { 
            // 기둥
			if(a == 0) columns[x][y] = true;
            
            // 보
			else beams[x][y] = true;
		}    
	}

    // 삭제 불가 확인
    public static boolean canNotDelete(int x, int y) {
        for (int i = 1; i <= size + 1; i++) {
            for (int j = 1; j <= size + 1; j++) {
                // 기둥 
                if (columns[i][j] && !canColumn(i, j)) return true;

                // 보
                if (beams[i][j] && !canBeam(i, j)) return true;
            }
        }
        return false;
    }

    // 기둥 설치 가능 확인
    public static boolean canColumn(int x, int y) {
        // 기둥이 바닥 위에 있을 때
        if (y == 1) return true;

        // 보의 한쪽 끝 위에 있을 때
        else if (beams[x][y] || beams[x - 1][y]) return true;

        // 다른 기둥 위에 있을 때
        else return columns[x][y - 1];
    }

    // 보 설치 가능 확인
    public static boolean canBeam(int x, int y) {
        // 한쪽 끝 부분이 기둥 위일 때
        if (columns[x][y - 1] || columns[x + 1][y - 1]) return true;

        // 양쪽 끝부분이 다른 보와 연결되어 있을 때
        else return beams[x + 1][y] && beams[x - 1][y];
    }
}
