package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24090 {
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); // 배열의 크기
        int countStandard = Integer.parseInt(st.nextToken()); // 교환횟수

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, n-1, countStandard);
        if (countStandard > cnt){
            System.out.println(-1);
        }

    }
    public static void quickSort(int[] a, int p, int r, int countStandard) {
        if (p < r) {
            int i = partition(a, p, r, countStandard);
            quickSort(a, p, i - 1, countStandard);
            quickSort(a, i + 1, r, countStandard);
        }
    }
    public static int partition(int[] a, int p, int r, int countStandard) {
        int pivot = a[r];
        int i = p-1;
        for (int j = p; j < r; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
                cnt++;
                if (cnt == countStandard) {
                    System.out.println(a[i] + " " + a[j]);
                    System.exit(0);
                }
            }
        }
        if (i + 1 != r) {
            swap(a, i + 1, r);
            cnt++;
            if (cnt == countStandard) {
                System.out.println(a[i + 1] + " " + a[r]);
                System.exit(0);
            }
        }
        return i + 1;
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
