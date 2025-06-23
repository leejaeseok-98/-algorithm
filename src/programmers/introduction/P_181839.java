package programmers.introduction;

public class P_181839 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        Sol8 sol = new Sol8();
        System.out.println(sol.solution(a, b));
    }
}
class Sol8 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 1){
            if (b % 2 == 0){
                return answer = 2 * (a + b);
            }
            else {
                return answer = (int)Math.pow(a,2) + (int)Math.pow(b,2);
            }
        } else {
            if (b % 2 == 1){
                return answer = 2 * (a + b);
            }
            else {
                return answer = Math.abs(a - b);
            }
        }
    }
}
