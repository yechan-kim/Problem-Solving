import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        int union = 0;
        int inter = 0;
        
        for(int i=0; i<str1.length()-1; i++){
            String temp = str1.substring(i, i+2);
            if(isAlpha(temp)){
                str1List.add(temp);
            }
        }
        
        for(int i=0; i<str2.length()-1; i++){
            String temp = str2.substring(i, i+2);
            if(isAlpha(temp)){
                str2List.add(temp);
            }
        }
        
        if(str1List.size() == 0 && str2List.size() == 0){
            return 65536;
        }
        
        union = str1List.size() + str2List.size();
        
        for(String str : str1List){
            if(str2List.remove(str)){
                inter++;
            }
        }
        
        union-=inter;
        
        return inter * 65536 / union;
    }
    
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[A-Z]*$");
    }
}