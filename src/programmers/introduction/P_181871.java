package programmers.introduction;

public class P_181871 {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        Solution41 sol = new Solution41();
        System.out.println(sol.solution(myString, pat));
    }
}
class Solution41{
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length()-pat.length(); i++) {
            if (myString.startsWith(pat, i)) {
                answer++;
            }
        }
        return answer;
    }
}