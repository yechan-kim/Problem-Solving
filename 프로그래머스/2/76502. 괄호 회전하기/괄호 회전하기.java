import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            boolean vaild = true;
            for(int j=0; j<s.length(); j++){
                char c =s.charAt(j);
                
                if(c == '[' || c == '(' || c == '{'){
                    stack.push(c);
                } else if(stack.isEmpty()){
                    vaild = false;
                    break;
                } else if(c == ']' && stack.peek() == '['){
                    stack.pop();
                } else if(c == ')' && stack.peek() == '('){
                    stack.pop();
                } else if(c == '}' && stack.peek() == '{'){
                    stack.pop();
                }
            }
            
            if(stack.isEmpty() && vaild){
                answer++;
            }
            
            s = s.substring(1) + s.charAt(0);
        }
        
        return answer;
    }
}