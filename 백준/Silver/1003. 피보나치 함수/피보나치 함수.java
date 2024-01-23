import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        
        map.put("0", "1 0");
        map.put("1", "0 1");
        map.put("2", "1 1");
        map.put("3", "1 2");
        map.put("4", "2 3");
        map.put("5", "3 5");
        map.put("6", "5 8");
        map.put("7", "8 13");
        map.put("8", "13 21");
        map.put("9", "21 34");
        map.put("10", "34 55");
        map.put("11", "55 89");
        map.put("12", "89 144");
        map.put("13", "144 233");
        map.put("14", "233 377");
        map.put("15", "377 610");
        map.put("16", "610 987");
        map.put("17", "987 1597");
        map.put("18", "1597 2584");
        map.put("19", "2584 4181");
        map.put("20", "4181 6765");
        map.put("21", "6765 10946");
        map.put("22", "10946 17711");
        map.put("23", "17711 28657");
        map.put("24", "28657 46368");
        map.put("25", "46368 75025");
        map.put("26", "75025 121393");
        map.put("27", "121393 196418");
        map.put("28", "196418 317811");
        map.put("29", "317811 514229");
        map.put("30", "514229 832040");
        map.put("31", "832040 1346269");
        map.put("32", "1346269 2178309");
        map.put("33", "2178309 3524578");
        map.put("34", "3524578 5702887");
        map.put("35", "5702887 9227465");
        map.put("36", "9227465 14930352");
        map.put("37", "14930352 24157817");
        map.put("38", "24157817 39088169");
        map.put("39", "39088169 63245986");
        map.put("40", "63245986 102334155");

        for (int i = 0; i < T; i++) {
           int N = Integer.parseInt(br.readLine());
              bw.write(map.get(String.valueOf(N)) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}