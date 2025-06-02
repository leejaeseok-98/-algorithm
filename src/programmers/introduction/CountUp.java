package programmers.introduction;

import java.util.Arrays;

public class CountUp {
    public static void main(String[] args) {
        int startNum = 3;
        int endNum = 10;

        Solution6 solution = new Solution6();
        System.out.println(Arrays.toString(solution.solution(startNum, endNum)));
    }
}

class Solution6 {
    public int[] solution(int startNum, int endNum) {
        int arraySize = endNum - startNum +1;
        int[] answer = new int[arraySize];
        int n = 0;
        for (int i = startNum; i <= endNum; i++) {
            answer[n] = i;
            n++;
        }
        return answer;
    }
}
