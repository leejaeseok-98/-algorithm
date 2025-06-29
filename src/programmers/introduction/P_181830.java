package programmers.introduction;

import java.util.Arrays;

public class P_181830 {
    public static void main(String[] args) {
        int[][] arr = {{572, 22, 37},{287, 726, 384},{85, 137, 292},{487, 13, 876}};
        Sol16 sol = new Sol16();
        System.out.println(Arrays.deepToString(sol.solution(arr)));
    }
}
class Sol16{
    public int[][] solution(int[][] arr) {
        int a = arr.length; //열의 수
        int b = arr[0].length; // 행의 수
        if (a > b){
            int[][] answer = new int[a][a];
            for (int i = 0; i < a; i++){
                for (int j = 0; j < b; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if (a < b) {
            int[][] answer = new int[b][b];
            for (int i = 0; i < a; i++){
                for (int j = 0; j < b; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }
        else {
            return arr;
        }
    }
}
