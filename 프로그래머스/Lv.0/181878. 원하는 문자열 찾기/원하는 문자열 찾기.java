class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myString.length() < pat.length())
            return 0;
        
        else{
            for(int i=0; i<=myString.length()-pat.length(); i++){
                if(myString.charAt(i) == pat.charAt(0)){
                    int count = 0;
                    
                    for(int j=0; j < pat.length(); j++){
                        if(myString.charAt(i+j) == pat.charAt(j))
                            count ++;
                    }
                    
                    if(pat.length() == count)
                        return 1;
                }
            }
            
            return 0;
        }
    }
}