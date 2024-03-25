import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static ArrayList<ArrayList<Integer>> list;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        for(int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            insert_edge(a, b);
        }

        for(int i = 1; i < N + 1; i++) {
            Collections.sort(list.get(i));
        }

        visited = new boolean[N + 1];
        dfs(V);
        bw.write("\n");
        visited = new boolean[N + 1];
        bfs(V);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void insert_edge(int a, int b) {
        list.get(a).add(b);
        list.get(b).add(a);
    }

    public static void dfs(int start) throws IOException {
        visited[start] = true;
        bw.write(start + " ");

        for(int next : list.get(start)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int x = q.poll();
            bw.write(x + " ");

            for(int next : list.get(x)) {
                if(!visited[next]) {
                    q.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}