package programmers.introduction;

import java.util.Arrays;

public class SequencesRangeQueries2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};

        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }
}

class Solution2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;

        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int tmp = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k){
                   tmp = Math.min(tmp, arr[i]);
                }
            }
            if (tmp == Integer.MAX_VALUE){
                answer[j] = -1;
            } else {
                answer[j] = tmp;
            }
            ++j;
        }
        return answer;
    }
}
