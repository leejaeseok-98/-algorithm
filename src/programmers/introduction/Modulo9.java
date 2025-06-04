package programmers.introduction;

public class Modulo9 {
    public static void main(String[] args) {
        String number = "78720646226947352489";

        Solution12 solution = new Solution12();
        System.out.println(solution.solution(number));
    }
}

class Solution12 {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            String s = number.substring(i, i + 1);
            answer += Integer.parseInt(s);
        }
        return answer%9;
    }
}
