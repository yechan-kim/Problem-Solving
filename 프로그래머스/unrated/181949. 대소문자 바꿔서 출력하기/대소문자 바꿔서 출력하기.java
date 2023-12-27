import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        
        for(int i=0; i<a.length(); i++){
            char tmp = a.charAt(i);
            if(tmp >= 'a' && tmp <= 'z')
                b += (char)(tmp - 32);
            else
                b += (char)(tmp + 32);
        }
        
        System.out.println(b);
    }
}