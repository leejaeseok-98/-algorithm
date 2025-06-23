package programmers.introduction;

public class P_181842 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";
        Sol6 sol6 = new Sol6();
        System.out.println(sol6.solution(str1, str2));
    }
}
class Sol6{
    public int solution(String str1, String str2){
        if (str2.contains(str1)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
