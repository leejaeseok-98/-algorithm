package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24091 {
    public static int k = 0;
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, n - 1);
        if (cnt < k){
            System.out.println(-1);
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int q = partition(arr, start, end);
            quickSort(arr, start, q - 1);
            quickSort(arr, q + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start -1;
        for(int j = start; j < end; j++) {
            if(arr[j] <= pivot) {
                swap(arr, ++i, j);
            }
        }
        if (i+1 != end) {
            swap(arr, i+1, end);
        }
        return i+1;

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        cnt++;
        if (cnt == k) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
