package programmers.introduction;

import java.util.Arrays;

public class P_181857 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        Solution50 solution50 = new Solution50();
        System.out.println(Arrays.toString(solution50.solution(arr)));
    }
}
class Solution50 {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int pow = 1;

        while (pow < length) {
            pow *= 2;
        }
        if (pow == length) {
            return arr;
        }
        int[] answer = new int[pow];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;

    }
}
