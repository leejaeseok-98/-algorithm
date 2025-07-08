package backJoon.noLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_11725 {
    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        tree = new ArrayList[n +1];
        parent = new int[n +1];
        visited = new boolean[n +1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        dfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }

    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int child : tree[node]) {
            if (!visited[child]) {
                parent[child] = node; //부모기록
                dfs(child);
            }
        }
    }
}
