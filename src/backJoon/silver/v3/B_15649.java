package backJoon.silver.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_15649 {
    static int n;
    static int m;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        int deep = 1;

        for (int i = 1; i <= n; i++){
            backTracking(i, deep);
        }



    }

    private static void backTracking(int now, int deep) {
        if (deep > m){
            return;
        }
        if (!visited[now]){
            sb.append(now).append("\n");
            visited[now] = true;
            deep++;
            backTracking(now,deep);

        }

    }
}
