package backJoon.silver.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11057 {
    final static int mod = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        // 점화식: dp[i][j] = dp[i][j-1] + dp[i-1][j]
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[n][i]) % mod;
        }

        System.out.println(result);
    }
}
