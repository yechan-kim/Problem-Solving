class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {        
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String b1 = Integer.toString(arr1[i],2);
            String b2 = Integer.toString(arr2[i],2);
            String temp = "";
            
            String[] bin1 = addZero(b1, n);
            String[] bin2 = addZero(b2, n);
            
            for(int j=0; j<n; j++){
                if(bin1[j].equals("1") || bin2[j].equals("1"))
                    temp += '#';
                else
                    temp += ' ';
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
    
    public String[] addZero(String str, int n) {
        if(str.length() != n) {
            String tmp = "";
            
            for(int i=0; i<n-str.length(); i++)
                tmp += "0";
            
            str = tmp + str;
        }

        return str.split("");
    }
}