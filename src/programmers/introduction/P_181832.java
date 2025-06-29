package programmers.introduction;

import java.util.Arrays;

public class P_181832 {
    public static void main(String[] args) {
        int n = 4;
        Sol13 sol = new Sol13();
        System.out.println(Arrays.deepToString(sol.solution(n)));
    }
}
class Sol13{
    public int[][] solution(int n){
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dx = {0, 1, 0, -1}; // 우 하 좌 상
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0; // 현재 위치와 방향
        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;
            visited[x][y] = true;

            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 경계 또는 이미 방문했으면 방향 전환
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]) {
                dir = (dir + 1) % 4; // 방향 전환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }
        return answer;
    }
}