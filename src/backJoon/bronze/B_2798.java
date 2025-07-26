package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class B_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st2.nextToken()); //카드 개수
        int m = Integer.parseInt(st2.nextToken()); // 기준 수
        int max = Integer.MIN_VALUE;

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] <= m){
                        max = Math.max(max, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
