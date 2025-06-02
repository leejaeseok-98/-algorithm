package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayMake2 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        Solution5 sol = new Solution5();
        System.out.println(Arrays.toString(sol.solution(l,r)));
    }
}

class Solution5 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean check = true;
            while(num > 0) {
                int digit = num % 10;
                if (digit != 0 && digit != 5){
                    check = false;
                    break;
                }
                num /= 10;
            }
            if (check){
                list.add(i);
            }
        }
        if (list.isEmpty()){
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}