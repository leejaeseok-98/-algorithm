package programmers.introduction;

import java.util.Arrays;

public class P_181835 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,100,99,98};
        int k = 3;
        Solution30 sol = new Solution30();
        System.out.println(Arrays.toString(sol.solution(arr, k)));
    }
}
class Solution30 {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        }
        return arr;
    }
}
