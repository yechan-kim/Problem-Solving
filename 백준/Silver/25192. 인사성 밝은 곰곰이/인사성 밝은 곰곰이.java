import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();

            if(tmp.equals("ENTER")){
                cnt += set.size();
                set.clear();
            } else {
                set.add(tmp);
            }
        }

        cnt += set.size();

        bw.write(String.valueOf(cnt));

        br.close();
        bw.flush();
        bw.close();
    }
}