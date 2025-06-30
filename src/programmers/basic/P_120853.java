package programmers.basic;

public class P_120853 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        P_120853_1 obj = new P_120853_1();
        System.out.println(obj.solution(s));
    }
}
class P_120853_1{
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                answer -= Integer.valueOf(str[i - 1]);
            } else {
                answer += Integer.valueOf(str[i]);
            }
        }
        return answer;
    }
}
