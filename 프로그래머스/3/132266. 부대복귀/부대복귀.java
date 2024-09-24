import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
	public int[] solution(int n, int[][] roads, int[] sources, int destination) {
		int[] answer = new int[sources.length];
		int[] distance = new int[n + 1]; // node -> destination 까지의 거리
        HashMap<Integer, ArrayList<Integer>> roadMap = new HashMap<>(); // 각 node에서 갈 수 있는 길
		PriorityQueue<int[]> navigator = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 거리순으로 자동으로 정렬해주는 우선순위 큐 네비게이터

        // 초기화
		for (int i = 0; i <= n; i++) {
			roadMap.put(i, new ArrayList<>());
			distance[i] = Integer.MAX_VALUE;
		}

        // Map에 길 저장
		for (int[] road : roads) {
			ArrayList<Integer> temp = roadMap.get(road[0]);
			temp.add(road[1]);
			roadMap.put(road[0], temp);

			temp = roadMap.get(road[1]);
			temp.add(road[0]);
			roadMap.put(road[1], temp);
		}

        // 자기 자신과의 거리는 0으로 처리
		distance[destination] = 0;
		navigator.add(new int[] {destination, 0});

        // 네이게이터에 목적지가 없을 때 까지 실행
		while (!navigator.isEmpty()) {
			int[] current = navigator.poll();

			if (distance[current[0]] >= current[1]) {
                
                // 노드마다 최소 경로 계산
				for (int next : roadMap.get(current[0])) {
					if (distance[next] > current[1] + 1) {
						distance[next] = current[1] + 1;
						navigator.add(new int[] {next, current[1] + 1}); // 네이게이터에 다음 경로 추가
					}
				}
			}
		}

        // 정답 배열 생성
		for (int i = 0; i < sources.length; i++) {
			if (distance[sources[i]] == Integer.MAX_VALUE) {
				answer[i] = -1;
			} else {
				answer[i] = distance[sources[i]];
			}
		}

		return answer;
	}
}