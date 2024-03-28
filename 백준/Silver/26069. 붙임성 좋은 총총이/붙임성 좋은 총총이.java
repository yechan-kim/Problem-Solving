import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();

        set.add("ChongChong");

        int N = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(set.contains(name1)){
                set.add(name2);
            } else if (set.contains(name2)){
                set.add(name1);
            }
        }

        bw.write(String.valueOf(set.size()));

        br.close();
        bw.flush();
        bw.close();
    }
}