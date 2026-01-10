import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		br.close();

		int[] arr = new int[n + 1];
		long[] cnt = new long[m];
		long result = 0L;

		for (int i = 1; i < n + 1; i++) {
			arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % m;

			if (arr[i] == 0) {
				result++;
			}

			cnt[arr[i]]++;
		}

		for (int i = 0; i < m; i++) {
			if (cnt[i] > 1) {
				result += (cnt[i] * (cnt[i] - 1) / 2);
			}
		}

		bw.write(result + "\n");

		bw.flush();
		bw.close();
	}
}
