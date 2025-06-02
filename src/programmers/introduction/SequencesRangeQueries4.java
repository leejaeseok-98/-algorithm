package programmers.introduction;

import java.util.Arrays;

public class SequencesRangeQueries4 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        Solution3 solution = new Solution3();
        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }
}

class Solution3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
