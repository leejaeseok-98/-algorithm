package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24060 {
    static int cnt = 0; // 저장 횟수 누적용 전역 변수
    static int result = -1; // 결과값 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, n - 1, k);
        System.out.println(result == -1 ? -1 : result);
    }

    public static void mergeSort(int[] arr, int p, int r, int k) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q, k);
            mergeSort(arr, q + 1, r, k);
            merge(arr, p, q, r, k);
        }
    }

    public static void merge(int[] arr, int p, int q, int r, int k) {
        int i = p, j = q + 1, t = 0;
        int[] tmp = new int[r - p + 1];

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = arr[i++];
        }
        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        t = 0;
        for (int idx = p; idx <= r; idx++) {
            arr[idx] = tmp[t++];
            cnt++;
            if (cnt == k) {
                result = arr[idx];
            }
        }
    }
}