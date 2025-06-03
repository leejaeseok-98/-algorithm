package programmers.introduction;

public class SimpleLogicalOperations {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

        Solution9 sol = new Solution9();
        System.out.println(sol.solution(x1, x2, x3, x4));
    }
}

class Solution9 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a = false;
        boolean b = false;

        if (x1 == true || x2 == true){
            a = true;
        }
        if (x3 == true || x4 == true){
            b = true;
        }
        if (a == false || b == false){
            answer = false;
        }
        return answer;
    }
}