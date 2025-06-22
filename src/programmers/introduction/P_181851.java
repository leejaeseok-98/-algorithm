package programmers.introduction;

import java.util.*;

public class P_181851 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        Sol2 sol2 = new Sol2();
        System.out.println(sol2.solution(rank, attendance));
    }
}
class Sol2{
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        int[][] arr = new int[n][2];

        // [rank, index] 형태로 2차원 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i][0] = rank[i];
            arr[i][1] = i;
        }

        // 등수(r[0]) 기준으로 오름차순 정렬
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // 참석 가능한 학생 3명 골라 index 저장
        int[] pick = new int[3];
        int cnt = 0;
        for (int i = 0; i < n && cnt < 3; i++) {
            if (attendance[arr[i][1]]) {
                pick[cnt++] = arr[i][1];
            }
        }

        // 공식에 따라 계산
        return 10000 * pick[0] + 100 * pick[1] + pick[2];
    }
}