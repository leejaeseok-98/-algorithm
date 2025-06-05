package programmers.introduction;

public class ReverseAString {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        Solution16 sol = new Solution16();
        System.out.println(sol.solution(my_string, s, e));
    }
}
class Solution16{
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        StringBuffer sb = new StringBuffer(my_string.substring(s,e+1));
        sb.reverse();
        answer += sb.toString();
        answer += my_string.substring(e+1);
        return answer;
    }
}
