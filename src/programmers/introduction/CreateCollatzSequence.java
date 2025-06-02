package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateCollatzSequence {
    public static void main(String[] args) {
        int n = 10;

        Solution7 sol = new Solution7();
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}

class Solution7 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n > 1){
            list.add(n);
            if (n % 2 ==0){
                n /= 2;
            }
            else {
                n = 3*n+1;
            }
            if (n == 1){
                list.add(1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
