class Solution {
	public int solution(int[][] board, int[][] skill) {
		int answer = 0;
		int[][] sum = new int[board.length + 1][board[0].length + 1]; // 누적합을 하기 위한 2차원 배열

		for (int[] command : skill) {
			// 공격: 내구도 감소
			if (command[0] == 1) {
				sum[command[1]][command[2]] = sum[command[1]][command[2]] - command[5];
				sum[command[3] + 1][command[4] + 1] = sum[command[3] + 1][command[4] + 1] - command[5];
				sum[command[1]][command[4] + 1] = sum[command[1]][command[4] + 1] + command[5];
				sum[command[3] + 1][command[2]] = sum[command[3] + 1][command[2]] + command[5];
			}

			// 회복: 내구도 증가
			else {
				sum[command[1]][command[2]] = sum[command[1]][command[2]] + command[5];
				sum[command[3] + 1][command[4] + 1] = sum[command[3] + 1][command[4] + 1] + command[5];
				sum[command[1]][command[4] + 1] = sum[command[1]][command[4] + 1] - command[5];
				sum[command[3] + 1][command[2]] = sum[command[3] + 1][command[2]] - command[5];
			}
		}

        // 위에서 아래로 누적합
		for (int j = 0; j <= board[0].length; j++) {
			for (int i = 1; i <= board.length; i++) {
				sum[i][j] += sum[i - 1][j];
			}
		}

        // 왼쪽에서 오른쪽으로 누적합
		for (int i = 0; i <= board.length; i++) {
			for (int j = 1; j <= board[0].length; j++) {
				sum[i][j] += sum[i][j - 1];
			}
		}

        // 보드판과 계산하여, 최종 내구도 계산 및 조건 확인
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] + sum[i][j] > 0) {
					answer++;
				}
			}
		}

		return answer;
	}
}