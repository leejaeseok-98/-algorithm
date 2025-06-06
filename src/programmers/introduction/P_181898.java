package programmers.introduction;

public class P_181898 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;
        Solution22 sol = new Solution22();
        System.out.println(sol.solution(arr, idx));

    }
}
class Solution22 {
    public int solution(int[] arr, int idx){
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}