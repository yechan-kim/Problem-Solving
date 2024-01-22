import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        long fx[] = new long[1000001];
        long gx[] = new long[1000001];

        Arrays.fill(fx, 1);

        for (int i = 2; i < fx.length; i++) {
            for (int j = 1; i * j < fx.length; j++)
                fx[i * j] += i;
        }

        for (int i = 1; i < gx.length; i++)
            gx[i] += gx[i - 1] + fx[i];

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(gx[N]).append("\n");
        }
        
        System.out.println(sb);
        
        br.close();
    }
}