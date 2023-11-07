import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String[] arr = new String[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.next();
        }

        Arrays.stream(arr).sorted().sorted((a, b) -> a.length() - b.length()).distinct().forEach(System.out::println);
    }
}