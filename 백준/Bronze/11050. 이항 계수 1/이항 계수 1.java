import java.util.*;

public class Main {
    public static int fact(int n) {
        int result = 1;
        
        for(int i=1; i<=n; i++)
            result *= i;
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int K = scan.nextInt();
        
        System.out.println(fact(N) / (fact(K) * fact(N - K)));
    }
}