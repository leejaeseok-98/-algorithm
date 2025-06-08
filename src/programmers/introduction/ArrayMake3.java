package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMake3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        Solution24 solution = new Solution24();
        System.out.println(Arrays.toString(solution.solution(arr, intervals)));
    }

}
class Solution24 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
