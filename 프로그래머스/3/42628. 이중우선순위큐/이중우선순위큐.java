import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int[] solution(String[] operations) {
		// 오름차순 큐
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		// 내림차순 큐
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

		for (String op : operations) {
			String[] cmd = op.split(" "); // 명령과 숫자 분리

			switch (cmd[0]) {
				// 삽입
				case "I": {
					Integer num = Integer.parseInt(cmd[1]);

					// 각각의 큐에 삽입
					minQueue.offer(num);
					maxQueue.offer(num);

					break;
				}

				// 삭제
				case "D": {
					// 최댓값 삭제 -> 오름차순 큐에서 삭제
					if (cmd[1].equals("1"))
						minQueue.remove(maxQueue.poll()); // 내림차순 큐에서도 삭제

						// 최소값 삭제 -> 내림차순 큐에서 삭제
					else
						maxQueue.remove(minQueue.poll()); // 오름차순 큐에서도 삭제
					break;
				}
			}
		}

		// 최대값 최소값 가져오기
		return new int[] {maxQueue.peek() == null ? 0 : maxQueue.peek(), minQueue.peek() == null ? 0 : minQueue.peek()};
	}
}