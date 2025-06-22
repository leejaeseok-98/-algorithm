package programmers.introduction;

public class P_181847 {
    public static void main(String[] args) {
        String n_str = "0010";
        Sol3 sol = new Sol3();
        System.out.println(sol.solution(n_str));
    }
}
class Sol3{
    public String solution(String n_str) {
        String answer = "";
        answer = n_str.replaceAll("0", " ");
        answer = answer.replaceFirst("^\\s+","");
        answer = answer.replaceAll(" ","0");
        return answer;

    }

}