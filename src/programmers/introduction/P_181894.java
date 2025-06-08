package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181894 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        Solution25 solution = new Solution25();
        System.out.println(Arrays.toString(solution.solution(arr)));
    }

}
class Solution25 {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                start = i;
                break;
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2){
                end = i;
                break;
            }
            else {
                end = -1;
            }
        }
        if (start == -1){
            return new int[]{-1};
        }

        int[] answer = Arrays.copyOfRange(arr, start, end+1);
        return answer;
    }
}