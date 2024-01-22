import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        List<String> list = new ArrayList<>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] op = br.readLine().split(" ");
            if (op[0].equals("add")) {
                if (!list.contains(op[1])) {
                    list.add(op[1]);
                }
            } else if (op[0].equals("remove")) {
                if (list.contains(op[1])) {
                    list.remove(op[1]);
                }
            } else if (op[0].equals("check")) {
                if (list.contains(op[1])) {
                    sb.append("1\n");
                } else
                    sb.append("0\n");
            } else if (op[0].equals("toggle")) {
                if (list.contains(op[1])) {
                    list.remove(op[1]);
                } else
                    list.add(op[1]);
            } else if (op[0].equals("all")) {
                list.clear();
                for (int j = 1; j <= 20; j++)
                    list.add(String.valueOf(j));
            } else if (op[0].equals("empty"))
                list.clear();
        }
        System.out.println(sb);

        br.close();
    }
}