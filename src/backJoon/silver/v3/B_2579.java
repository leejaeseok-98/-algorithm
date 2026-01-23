package backJoon.silver.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2579 {
    private static int max;
    private static int n;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0,0,0);
        System.out.println(max);
    }

    public static void dfs(int num, int sum, int check){
        if (n <= num || check >= 2){
            return;
        }
        sum += arr[num];
        if (max < sum){
            max = sum;
        }
        dfs(num+1, sum, check+1);
        dfs(num+2, sum, 0);
    }
}
