import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[][] log = new String[n][2];

        for (int i = 0; i < n; i++) {
            log[i][0] = scanner.next();
            log[i][1] = scanner.next();
        }

        Set<String> enterSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (log[i][1].equals("enter"))
                enterSet.add(log[i][0]);
            else if (log[i][1].equals("leave"))
                enterSet.remove(log[i][0]);
        }

        List<String> enterList = new ArrayList<>(enterSet);
        enterList.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();

        for (String name : enterList)
            result.append(name).append("\n");

        System.out.print(result);
    }
}