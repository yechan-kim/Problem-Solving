import java.util.*;

class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> startTime = new HashMap<>();
        TreeSet<String> carID = new TreeSet<>();
        List<String> parking = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(String str : records){
            String[] tmp = str.split(" ");
            
            String[] hour = tmp[0].split(":");
            int time = Integer.parseInt(hour[0]) * 60 + Integer.parseInt(hour[1]);
            
            String ID = tmp[1];
            
            if(tmp[2].equals("IN")){
                startTime.put(ID, time);
                parking.add(ID);
                carID.add(ID);
            } else if(tmp[2].equals("OUT")){
                map.put(ID, map.getOrDefault(ID, 0) + time - startTime.get(ID));
                parking.remove(ID);
            }
        }
                
        int lastTime = 23 * 60 + 59;
        for(String ID : parking){
            map.put(ID, map.getOrDefault(ID, 0) + lastTime - startTime.get(ID));
        }
        
        
        for(String ID : carID){
            int time = map.get(ID) - fees[0];
            if(time < 0){
                time = 0;
            }
            
            int fee = fees[1];
            
            if(time % fees[2] == 0){
                fee += fees[3] * (time / fees[2]);
            } else {
                fee += fees[3] * (time / fees[2] + 1);
            }
            
            answer.add(fee);
        }
        
        return answer;
    }
}