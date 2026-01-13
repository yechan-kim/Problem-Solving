import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());

        int[][] b = new int[m][k];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < k; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < k; j++) {
                int sum = 0;
                
                for (int l = 0; l < m; l++) {
                    sum += a[i][l] * b[l][j];
                }
                
                sb.append(sum).append(" ");
            }
            
            bw.write(sb.toString().trim());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
