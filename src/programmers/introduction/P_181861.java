package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181861 {
    public static void main(String[] args) {
        int[] arr = {5,1,4};
        Solution46 sol = new Solution46();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
class Solution46 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            for (int j = 0 ; j < i; j++){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
