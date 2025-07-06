package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24173 {
    public static int exchangeCnt = 0;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        exchangeCnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(arr);

        if (exchangeCnt > cnt) {
            System.out.println(-1);
        }
    }

    public static void heapSort(int[] a) {
        int n = a.length-1;
        min_heap(a, n);
        for (int i=n; i>=2; i--) {
            swap(a, 1, i);
            heapify(a, 1, i-1);
        }
    }

    public static void min_heap(int[] arr, int n) {
        for(int i=n/2; i>=1; i--) heapify(arr, i, n);
    }

    public static void heapify(int[] arr, int k, int n) {
        int left = 2*k;
        int right = 2*k + 1;
        int min;
        if (right <= n ) {
            if (arr[left] < arr[right]) min = left;
            else min = right;
        } else if (left <= n) min = left;
        else return;

        if(arr[min] < arr[k]) {
            swap(arr, min, k);
            heapify(arr, min, n);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        cnt++;

        if(exchangeCnt == cnt) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[b]);
            sb.append(" ");
            sb.append(arr[a]);
            System.out.println(sb.toString());
            System.exit(0);
        }
    }
}
