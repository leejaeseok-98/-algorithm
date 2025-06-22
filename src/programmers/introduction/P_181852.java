package programmers.introduction;

import java.util.Arrays;

public class P_181852 {
    public static void main(String[] args) {
        int[] num_list = {12,4,15,46,38,1,14,56,32,10};
        Sol sol = new Sol();
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}
class Sol{
    public int[] solution(int[] num_list){
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        int n = 0;
        for(int i = 5; i < num_list.length; i++){
            answer[n] = num_list[i];
            ++n;
        }
        return answer;
    }
}
