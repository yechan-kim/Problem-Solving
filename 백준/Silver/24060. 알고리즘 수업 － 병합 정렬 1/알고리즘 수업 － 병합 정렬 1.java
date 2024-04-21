import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int[] sorted;
    static int K;
    static int countedElements = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        sorted = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, N - 1);

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(countedElements > K)
            return;
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
            }
        }

        if (i > mid) {
            for (int l = j; l <= end; l++) {
                sorted[k++] = arr[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                sorted[k++] = arr[l];
            }
        }

        for (int l = start; l <= end; l++) {
            countedElements++;

            if(countedElements == K){
                result = sorted[l];
                break;
            }

            arr[l] = sorted[l];
        }
    }
}