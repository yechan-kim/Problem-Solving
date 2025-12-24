import java.util.*;

class Solution {
    class File {
        String head;
        int number;
        String raw;

        File(String head, int number, String raw) {
            this.head = head;
            this.number = number;
            this.raw = raw;
        }
    }
    
    public String[] solution(String[] files) {
        int size = files.length;
        List<File> list = new ArrayList<>();
        
        for(String file : files) {
            int length = file.length();
            int numberIdx = 0;
            int tailIdx = length;
            
            char[] chArr = file.toCharArray();
                
            for(int i=0; i<length; i++) {
                if(Character.isDigit(chArr[i])) {
                    numberIdx = i;
                    break;
                }
            }
                   
            for(int i=numberIdx+1; i<length; i++) {
                if(!Character.isDigit(chArr[i])) {
                    tailIdx = i;
                    break;
                }
            }
             
            list.add(
                new File(
                    file.substring(0, numberIdx).toLowerCase(),
                    Integer.parseInt(file.substring(numberIdx, tailIdx)),
                    file
                )
            );
        }
        
        list.sort(
            Comparator
                .comparing((File f) -> f.head)
                .thenComparingInt(f -> f.number)
        );
        
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i).raw;
        }
        
        return answer;
    }
}