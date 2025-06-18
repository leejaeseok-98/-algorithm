package programmers.introduction;

public class P_181872 {
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";
        Solution40 obj = new Solution40();
        System.out.println(obj.solution(myString, pat));
    }
}
class Solution40{
    public String solution(String myString, String pat) {
        String answer = "";
        answer += myString.substring(0,myString.lastIndexOf(pat)+pat.length());
        return answer;
    }
}
