class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        for (String str : routes) {
            char op = str.charAt(0);
            int n = str.charAt(2) - '0';
            int temp_y = answer[0];
            int temp_x = answer[1];
            boolean vaild = true;

            switch (op) {
                case 'N':
                    for (int i = 0; i < n; i++) {
                        if (--temp_y < 0 || park[temp_y].charAt(temp_x) == 'X') {
                            vaild = false;
                            break;
                        }
                    }
                    
                    if(vaild){
                        answer[0] = temp_y;
                    }
                    
                    break;

                case 'S':
                    for (int i = 0; i < n; i++) {
                        if (++temp_y >= park.length || park[temp_y].charAt(temp_x) == 'X') {
                            vaild = false;
                            break;
                        }
                    }
                    
                    if(vaild){
                        answer[0] = temp_y;
                    }
                    
                    break;

                case 'W':
                    for (int i = 0; i < n; i++) {
                        if (--temp_x < 0 || park[temp_y].charAt(temp_x) == 'X') {
                            vaild = false;
                            break;
                        }
                        
                    }
                    
                    if(vaild){
                        answer[1] = temp_x;
                    }
                    
                    break;

                case 'E':
                    for (int i = 0; i < n; i++) {
                        if (++temp_x >= park[temp_y].length() || park[temp_y].charAt(temp_x) == 'X') {
                            vaild = false;
                            break;
                        }
                    }
                    
                    if(vaild){
                        answer[1] = temp_x;
                    }
                    
                    break;
            }
        }

        return answer;
    }
}