package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMake5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        Solution14 sol = new Solution14();
        System.out.println(Arrays.toString(sol.soltuion(intStrs, k, s, l)));
    }

}

class Solution14{
    public int[] soltuion(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
           int parseInt = Integer.parseInt(str.substring(s,s+l));
           if (k < parseInt){
               list.add(parseInt);
           }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}