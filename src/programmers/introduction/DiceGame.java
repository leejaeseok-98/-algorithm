package programmers.introduction;

import java.util.Arrays;

public class DiceGame {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 3;
        int d = 6;

        Solution10 solution10 = new Solution10();
        System.out.println(solution10.solution(a, b, c, d));
    }
}
class Solution10 {
    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            // 네 주사위 숫자가 모두 같을 때
            return 1111 * dice[0];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            // 세 주사위 숫자가 같을 때
            int p = (dice[1] == dice[2]) ? dice[1] : dice[2];
            int q = (dice[0] == dice[1]) ? dice[3] : dice[0];
            return (int) Math.pow(10 * p + q, 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            // 두 개씩 같은 숫자가 나올 때
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        } else if (dice[0] == dice[1]) {
            // 두 주사위 숫자가 같고 나머지 두 개가 다를 때
            return dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
        } else {
            // 네 주사위 숫자가 모두 다를 때
            return dice[0];
        }
    }
}
