package programmers.introduction;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181860 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        Solution47 sol = new Solution47();
        System.out.println(Arrays.toString(sol.solution(arr, flag)));
    }
}
class Solution47 {
    public int[] solution(int[] arr,boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2;j++){
                    list.add(arr[i]);
                }
            } else if (!flag[i]) {
                for (int j = 0; j < arr[i];j++){
                    list.remove(list.size()-1);
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
