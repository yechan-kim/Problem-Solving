import java.util.*;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] arr = new int[N][M];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    queue.offer(new Point(j, i));
                }
            }
        }

        int[] dx = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};

        int days = bfs(arr, queue, dx, dy);

        if (containsZero(arr)) {
            System.out.println("-1");
        } else {
            System.out.println(days);
        }
    }


    private static int bfs(int[][] arr, Queue<Point> queue, int[] dx, int[] dy) {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Point point = queue.poll();

                for (int j = 0; j < 6; j++) {
                    int nx = point.x + dx[j];
                    int ny = point.y + dy[j];

                    if (isValidPoint(arr, nx, ny) && arr[ny][nx] == 0) {
                        arr[ny][nx] = 1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }

            days++;
        }

        return days;
    }

    private static boolean isValidPoint(int[][] arr, int x, int y) {
        return x >= 0 && x < arr[0].length && y >= 0 && y < arr.length;
    }

    private static boolean containsZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}