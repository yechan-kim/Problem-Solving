import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<int[]> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        int idx = map.get(ext);

        for(int[] arr : data){
            if(arr[idx] < val_ext){
                list.add(arr);
            }   
        }
        
        Collections.sort(list, (o1, o2)->{
            return o1[map.get(sort_by)] - o2[map.get(sort_by)];
        });

        answer = new int[list.size()][];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}