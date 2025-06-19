package programmers.introduction;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P_181862 {
    public static void main(String[] args) {
        String myStr = "cabab";
        Solution45 sol = new Solution45();
        System.out.println(Arrays.toString(sol.solution(myStr)));
    }
}
class Solution45 {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        if (st.countTokens() >= 1) {
            String[] answer = new String[st.countTokens()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = st.nextToken();
            }
            return answer;
        }
        else {
            String[] answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
    }
}
