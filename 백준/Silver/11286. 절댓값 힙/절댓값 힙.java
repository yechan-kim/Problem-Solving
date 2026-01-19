import java.io.*;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
			int absA = Math.abs(a);
			int absB = Math.abs(b);
			if (absA == absB) {
				return a - b; // 절댓값이 같으면 실제 값이 작은 순서
			}
			return absA - absB; // 절댓값이 작은 순서
		});

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());

			if (x == 0) {
				if (pq.isEmpty()) {
					bw.write("0\n");
				} else {
					bw.write(pq.poll() + "\n");
				}
			} else {
				pq.offer(x);
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
