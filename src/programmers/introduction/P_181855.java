package programmers.introduction;

import java.util.Arrays;

public class P_181855 {
    public static void main(String[] args) {
        String[] strArr = {"a","b","efg","hia","hia"};
        Solution51 sol = new Solution51();
        System.out.println(sol.solution(strArr));
    }
}
class Solution51 {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = strArr[i].length();
        }
        Arrays.sort(arr);
        int max = 1;
        int count = 1;

        // 길이별 등장 횟수 세기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        // 마지막 그룹 체크
        max = Math.max(max, count);

        return max;
    }
}