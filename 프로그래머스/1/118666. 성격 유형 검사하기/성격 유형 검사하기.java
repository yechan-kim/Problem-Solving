import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
        
        for(int i=0; i<survey.length; i++){
            String str1 = String.valueOf(survey[i].charAt(0));
            String str2 = String.valueOf(survey[i].charAt(1));
            
            switch(choices[i]){
                case 1:
                    map.put(str1,map.get(str1)+3);
                    break;
                case 2:
                    map.put(str1,map.get(str1)+2);
                    break;
                case 3:
                    map.put(str1,map.get(str1)+1);
                    break;
                case 5:
                    map.put(str2,map.get(str2)+1);
                    break;
                case 6:
                    map.put(str2,map.get(str2)+2);
                    break;
                case 7:
                    map.put(str2,map.get(str2)+3);
                    break;
                default:
                    break;
            }
        }
        
        if(map.get("T") > map.get("R")){
            answer += "T";
        } else{
            answer += "R";
        }
        
        if(map.get("F") > map.get("C")){
            answer += "F";
        } else{
            answer += "C";
        }
        
        if(map.get("M") > map.get("J")){
            answer += "M";
        } else{
            answer += "J";
        }
        
        if(map.get("N") > map.get("A")){
            answer += "N";
        } else{
            answer += "A";
        }
        
        return answer;
    }
}