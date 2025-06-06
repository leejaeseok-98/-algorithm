package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMake1 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        Solution20 sol = new Solution20();
        System.out.println(Arrays.toString(sol.solution(n, k)));
    }
}
class Solution20 {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
