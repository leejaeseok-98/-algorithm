package backJoon.silver.v3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i][0] = num;
        }

        int sum = 0;
        int avg = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i][0];
        }
        avg = Math.round((float) sum / n);
        sb.append(avg).append("\n");

        Arrays.sort(arr,((o1, o2) -> {
            return o1[0] - o2[0];
        }));

        sb.append(arr[n/2][0]).append("\n");

        int cnt = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i][0] == arr[i+1][0]){
                cnt++;
            } else {
                arr[i][1] = cnt + 1;
            }
        }
    }
}
