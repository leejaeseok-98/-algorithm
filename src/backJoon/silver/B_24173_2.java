package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24173_2 {
    public static int exchangeCnt = 0;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        exchangeCnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(arr);

        if (exchangeCnt > cnt) {
            System.out.println(-1);
        }
        br.close();
    }

    public static void heapSort(int[] a) {
        int n = a.length;
        buildMinHeap(a, n);
        for (int i = n - 1; i >= 1; i--) {
            swap(a, 0, i);
            heapify(a, 0, i);
        }
    }

    public static void buildMinHeap(int[] arr, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int k, int n) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;
        int min = k;

        if (left < n && arr[left] < arr[min]) min = left;
        if (right < n && arr[right] < arr[min]) min = right;

        if (min != k) {
            swap(arr, min, k);
            heapify(arr, min, n);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        cnt++;

        if (exchangeCnt == cnt) {
            System.out.println((b + 1) + " " + (a + 1)); // 1-based index로 출력
            System.exit(0);
        }
    }
}
