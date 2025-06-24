package programmers.introduction;

import java.util.Arrays;

public class P_181833 {
    public static void main(String[] args) {
        int n = 3;
        Sol12 sol12 = new Sol12();
        System.out.println(Arrays.deepToString(sol12.solution(n)));
    }
}
class Sol12{
    public int[][] solution(int n){
        int[][] answer = new int[n][n];
        for(int i = 0; i<n; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}
