package programmers.introduction;

public class P_181887 {
    public static void main(String[] args) {
        int[] num_list = {4,2,6,1,7,6};
        Solution34 solution34 = new Solution34();
        System.out.println(solution34.solution(num_list));
    }
}
class Solution34{
    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                a += num_list[i];
            } else {
                b += num_list[i];
            }
        }
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }
        else {
            return a;
        }
    }
}
