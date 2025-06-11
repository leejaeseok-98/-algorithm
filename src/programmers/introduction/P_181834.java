package programmers.introduction;

public class P_181834 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        Solution31 solution = new Solution31();
        System.out.println(solution.solution(myString));
    }
}
class Solution31 {
    public String solution(String myString) {
        String answer = myString.replaceAll("[a-l]", "l");
        return answer;
    }
}