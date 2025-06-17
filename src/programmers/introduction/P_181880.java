package programmers.introduction;

public class P_181880 {
    public static void main(String[] args) {
        int[] num_list = {12,4,15,1,14};
        Solution38 sol = new Solution38();
        System.out.println(sol.solution(num_list));
    }
}
class Solution38{
    public int solution(int[] num_list) {
        int cnt = 0;
        for(int i : num_list){
            while(i > 1){
                if (i % 2 == 0){
                    i /= 2;
                    cnt++;
                }
                else{
                    i = (i - 1) / 2;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
