import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < N; i++)
            A.add(scan.nextInt());

        for (int i = 0; i < M; i++)
            B.add(scan.nextInt());

        for (int a : A) {
            if (!B.contains(a))
                result.add(a);
        }
        for (int b : B) {
            if (!A.contains(b))
                result.add(b);
        }

        System.out.println(result.size());
    }
}