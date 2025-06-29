package programmers.introduction;

public class P_181829 {
    public static void main(String[] args) {
        int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
        int k = 2;
        Sol15 sol = new Sol15();
        System.out.println(sol.solution(board, k));
    }
}
class Sol15{
    public int solution(int[][] board, int k){
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
