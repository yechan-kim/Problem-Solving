import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        s = s.substring(2,s.length());
        s = s.substring(0,s.length()-2).replace("},{","-");
        String arr[] = s.split("-");  
        
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for(String str : arr){
            String[] temp = str.split(",");
            
            for(String tmp : temp){
                int n = Integer.parseInt(tmp);
                
                if(!list.contains(n)){
                    list.add(n);
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}