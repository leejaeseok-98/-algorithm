package programmers.introduction;

public class P_181837 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        Sol10 sol10 = new Sol10();
        System.out.println(sol10.solution(order));
    }
}
class Sol10{
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                answer += 5000;
            }
            else if (s.contains("americanoice")) {
                answer += 4500;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}
