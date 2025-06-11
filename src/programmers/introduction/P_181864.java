package programmers.introduction;

public class P_181864 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        Solution32 sol = new Solution32();
        System.out.println(sol.solution(myString,pat));
    }
}
class Solution32 {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(myString);
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 65) {
                sb.setCharAt(i, 'B');
            }
            else {
                sb.setCharAt(i, 'A');
            }
        }
        String str = sb.toString();
        if (str.contains(pat)){
            answer++;
        }
        return answer;
    }
}
