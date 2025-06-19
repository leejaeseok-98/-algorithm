package programmers.introduction;

import java.util.Arrays;

public class P_181866 {
    public static void main(String[] args) {
        String myString = "dxxbbbxaaaa";
        Solution44 sol = new Solution44();
        System.out.println(Arrays.toString(sol.solution(myString)));
    }
}
class Solution44 {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x"," ").trim();
        String[] temp = myString.split(" ");

        // 빈 문자열 제거
        String[] answer = Arrays.stream(temp)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        Arrays.sort(answer);
        return answer;
    }
}
