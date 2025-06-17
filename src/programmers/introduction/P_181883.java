package programmers.introduction;

import java.util.Arrays;

public class P_181883 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1},{1,2},{2,3}};
        Solution36 sol = new Solution36();
        System.out.println(Arrays.toString(sol.solution(arr, queries)));
    }
}
class Solution36 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                ++arr[i];
            }
        }
        return arr;
    }
}
