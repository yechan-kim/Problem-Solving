import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Set<String> result = new HashSet<>();
        
        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j <= input.length(); j++)
                result.add(input.substring(i, j));
        }

        System.out.println(result.size());
    }
}