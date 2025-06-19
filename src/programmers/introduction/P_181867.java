package programmers.introduction;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P_181867 {
    public static void main(String[] args) {
        String myString = "xabcxdefxghi";
        Solution43 sol = new Solution43();
        System.out.println(Arrays.toString(sol.solution(myString)));
    }
}
class Solution43 {
    public int[] solution(String myString) {
        int length = myString.length() - myString.replaceAll("x", "").length();
        int[] answer = new int[length+1];
        int i = 0;
        int j = 0;
        int cnt = 0;
        for (char c : myString.toCharArray()) {
            if (c != 'x') {
                ++cnt;
                ++i;
            }
            else if (c == 'x') {
                answer[j] = cnt;
                ++j;
                ++i;
                cnt = 0;
            }
        }
        if (i == myString.length()) {
            answer[j] = cnt;
        }
        return answer;
    }
}
