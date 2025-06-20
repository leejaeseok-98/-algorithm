package programmers.introduction;

import java.util.Arrays;

public class P_181854 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        Solution52 sol = new Solution52();
        System.out.println(Arrays.toString(sol.solution(arr, n)));
    }
}
class Solution52 {
    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = arr[i] + n;
            }
        } else if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = arr[i] + n;
            }
        }
        return arr;
    }
}
