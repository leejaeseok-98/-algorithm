package programmers.introduction;

public class P_181840 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int n = 3;
        Solution33 sol = new Solution33();
        System.out.println(sol.solution(num_list, n));
    }
}
class Solution33 {
    public int solution(int[] num_list,int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
            }
        }
        return answer;
    }
}
