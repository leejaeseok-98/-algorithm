package programmers.introduction;

public class FIndTheDesiredString {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        Solution28 sol = new Solution28();
        System.out.println(sol.solution(myString, pat));
    }
}
class Solution28 {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if (myString.contains(pat)){
            return 1;
        }
        else {
            return 0;
        }
    }
}
