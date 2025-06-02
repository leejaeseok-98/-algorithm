package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMake4 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};

        Solution8 sol = new Solution8();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}

class Solution8 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0; // 초기값
        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                ++i;
            } else if (arr[i] > list.get(list.size() - 1)) {
                list.add(arr[i]);
                ++i;
            } else {
                list.remove(list.size()-1);
            }
        }
        int[] stk = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}
