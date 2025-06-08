package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutList {
    public static void main(String[] args) {
        int n = 3;
        int[] slicer = {1,5,2};
        int[] num_list = {1,2,3,4,5,6,7,8,9};

        Solution23 sol = new Solution23();
        System.out.println(Arrays.toString(sol.solution(n, slicer, num_list)));
    }
}
class Solution23 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if (n == 1){
            for (int i = 0; i <= b; i++){
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        }
        else if (n == 3){
            for (int i = a; i <= b; i++){
                list.add(num_list[i]);
            }
        }
        else if (n == 4){
            for (int i = a; i <= b; i += c){
                list.add(num_list[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
