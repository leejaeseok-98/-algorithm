package programmers.introduction;

import java.util.Arrays;

public class SequencesRangeQueries3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3},{1,2},{1,4}};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int a = answer[j];
            answer[j] = answer[i];
            answer[i] = a;
        }

        return answer;
    }
}
