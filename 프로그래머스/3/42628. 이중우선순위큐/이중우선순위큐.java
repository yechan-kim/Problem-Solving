import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int[] solution(String[] operations) {
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		 PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

		for (String op : operations) {
			String[] cmd = op.split(" ");

			switch (cmd[0]) {
				case "I": {
					Integer num = Integer.parseInt(cmd[1]);

					minQueue.offer(num);
					maxQueue.offer(num);
					break;
				}
				case "D": {
					if (cmd[1].equals("1")) {
						minQueue.remove(maxQueue.poll());
					} else {
						maxQueue.remove(minQueue.poll());
					}
					break;
				}
			}
		}

		return new int[] {maxQueue.peek() == null ? 0 : maxQueue.peek(), minQueue.peek() == null ? 0 : minQueue.peek()};
	}
}