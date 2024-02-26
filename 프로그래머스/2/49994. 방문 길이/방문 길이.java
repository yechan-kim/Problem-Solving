import java.util.*;

class Solution {
    public int solution(String dirs) {
        boolean[][] visited = new boolean[21][21];
        int x = 10, y = 10;
        int answer = 0;

        for (int i = 0; i < dirs.length(); i++) {
            switch (dirs.charAt(i)) {
                case 'U':
                    if (y < 19) {
                        y++;
                        if(!visited[y][x]){
                            answer++;
                            visited[y][x] = true;
                        }
                        y++;
                    }
                    
                    break;
                case 'D':
                    if (y > 0) {
                        y--;
                        if(!visited[y][x]){
                            answer++;
                            visited[y][x] = true;
                        }
                        y--;
                    }
                    
                    break;
                case 'R':
                    if (x < 19) {
                        x++;
                        if(!visited[y][x]){
                            answer++;
                            visited[y][x] = true;
                        }
                        x++;
                    }
                    
                    break;
                case 'L':
                    if (x > 0) {
                        x--;
                        if(!visited[y][x]){
                            answer++;
                            visited[y][x] = true;
                        }
                        x--;
                    }
                    
                    break;
            }
        }

        return answer;
    }
}