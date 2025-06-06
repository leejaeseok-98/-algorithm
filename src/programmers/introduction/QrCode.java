package programmers.introduction;

public class QrCode {
    public static void main(String[] args) {
        int q = 1;
        int r = 0;
        String code = "programmers";
        Solution18 sol = new Solution18();
        System.out.println(sol.solution(q, r, code));
    }

}
class Solution18 {
    public  String solution(int q,int r,String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if ((i%q) == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}
