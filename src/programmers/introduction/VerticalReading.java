package programmers.introduction;

public class VerticalReading {
    public static void main(String[] args) {
        String my_string = "programmers";
        int m = 1;
        int c = 1;
        Solution17 sol = new Solution17();
        System.out.println(sol.solution(my_string, m, c));
    }
}
class Solution17 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] strs = new String[my_string.length()/m];
        int a = 0;
        int b = m;
        for (int i = 0; i < my_string.length()/m; i++) {
            strs[i] = my_string.substring(a, b);
            a += m;
            b += m;
        }
        for (int i = 0; i < strs.length; i++) {
            answer += strs[i].charAt(c-1);
        }
        return answer;
    }
}
