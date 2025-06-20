package programmers.introduction;

import java.util.*;

public class P_181858 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        Solution49 sol = new Solution49();
        System.out.println(Arrays.toString(sol.solution(arr, k)));
    }
}
class Solution49 {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                list.add(num);
                seen.add(num);
            }
            if (list.size() == k) break;
        }

        while (list.size() < k) {
            list.add(-1);
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
