package programmers.introduction;

public class P_181841 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        Sol7 sol7 = new Sol7();
        System.out.println(sol7.solution(str_list, ex));
    }
}
class Sol7{
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String str : str_list) {
            if (str.contains(ex)) {

            }else {
                answer += str;
            }
        }
        return answer;
    }
}
