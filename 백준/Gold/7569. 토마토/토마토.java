import java.util.*;

public class Main {
    static class Point {
        int x, y, z;

        Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int H = scanner.nextInt();

        int[][][] arr = new int[H][N][M];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    arr[i][j][k] = scanner.nextInt();
                    if (arr[i][j][k] == 1) {
                        queue.offer(new Point(k, j, i));
                    }
                }
            }
        }

        int[] dx = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        int days = bfs(arr, queue, dx, dy, dz);

        if (containsZero(arr)) {
            System.out.println("-1");
        } else {
            System.out.println(days);
        }
    }


    private static int bfs(int[][][] arr, Queue<Point> queue, int[] dx, int[] dy, int[] dz) {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Point point = queue.poll();

                for (int j = 0; j < 6; j++) {
                    int nx = point.x + dx[j];
                    int ny = point.y + dy[j];
                    int nz = point.z + dz[j];

                    if (isValidPoint(arr, nx, ny, nz) && arr[nz][ny][nx] == 0) {
                        arr[nz][ny][nx] = 1;
                        queue.offer(new Point(nx, ny, nz));
                    }
                }
            }

            days++;
        }

        return days;
    }

    private static boolean isValidPoint(int[][][] arr, int x, int y, int z) {
        return x >= 0 && x < arr[0][0].length && y >= 0 && y < arr[0].length && z >= 0 && z < arr.length;
    }

    private static boolean containsZero(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}