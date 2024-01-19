import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int[] count = new int[8001];

        for (int i = 0; i < N; i++)
            count[arr[i] + 4000]++;

        int max = Arrays.stream(count).max().getAsInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 8001; i++)
            if (count[i] == max)
                list.add(i - 4000);

        Collections.sort(list);

        System.out.println(Math.round(Arrays.stream(arr).average().getAsDouble()));
        System.out.println(arr[N / 2]);
        System.out.println(list.size() > 1 ? list.get(1) : list.get(0));
        System.out.println(Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt());

        br.close();
    }
}