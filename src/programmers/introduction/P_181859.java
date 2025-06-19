package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181859 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,0};
        Solution48 sol = new Solution48();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
class Solution48{
    public int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()){
                list.add(arr[i]);
            }
            else if (arr[i] == list.get(list.size() - 1)) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
