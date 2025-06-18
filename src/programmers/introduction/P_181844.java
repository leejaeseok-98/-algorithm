package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181844 {
    public static void main(String[] args) {
        int[] arr = {293,1000,395,678,94};
        int[] delete_list = {94,777,104,1000,1,12};
        Solution39 sol = new Solution39();
        System.out.println(Arrays.toString(sol.solution(arr, delete_list)));
    }
}
class Solution39 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]){
                    list.remove(Integer.valueOf(arr[i]));
                    break;
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
