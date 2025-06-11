package programmers.introduction;

public class P_181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        Solution29 sol = new Solution29();
        System.out.println(sol.solution(binomial));
    }
}
class Solution29 {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split("\\s");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        if (str[1].equals("+")){
            answer = a + b;
        }
        else if (str[1].equals("-")){
            answer = a - b;
        }
        else {
            answer = a * b;
        }
        return answer;
    }
}