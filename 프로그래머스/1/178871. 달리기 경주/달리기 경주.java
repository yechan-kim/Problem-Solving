import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];

		HashMap<String, Integer> playerMap = new HashMap<>();
		HashMap<Integer, String> rankMap = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			playerMap.put(players[i], i);
			rankMap.put(i, players[i]);
		}

		for (String str : callings) {
			int rank = playerMap.get(str);
			String player = rankMap.get(rank);
			String frontPlayer = rankMap.get(rank - 1);

			playerMap.put(player, rank - 1);
			playerMap.put(frontPlayer, rank);

			rankMap.put(rank - 1, player);
			rankMap.put(rank, frontPlayer);
		}

		for (int i = 0; i < players.length; i++) {
			answer[i] = rankMap.get(i);
		}

		return answer;
	}
        
}