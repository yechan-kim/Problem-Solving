import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Set<String> arrSet = new HashSet<>(N);
        int M = scan.nextInt();
        int cnt = 0;
        Set<String> arr = new HashSet<>(N);

        for (int i = 0; i < N; i++)
            arrSet.add(scan.next());

        for (int i = 0; i < M; i++) {
            String current = scan.next();
            if (arrSet.contains(current)) {
                cnt++;
                arr.add(current);
            }
        }

        System.out.println(cnt);
        arr.stream().sorted().forEach(System.out::println);
    }
}