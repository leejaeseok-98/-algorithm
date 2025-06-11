package programmers.introduction;

import java.util.Arrays;

public class LeftRight {
    public static void main(String[] args) {
        String[] str_list = {"u","u","l","r"};
        Solution27 sol = new Solution27();
        System.out.println(Arrays.toString(sol.solution(str_list)));
    }
}
class Solution27{
    public String[] solution(String[] str_list) {
        int index = -1;
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("r")){
                index = i;
                answer = Arrays.copyOfRange(str_list, index+1, str_list.length);
                break;
            }
            else if (str_list[i].equals("l")){
                index = i;
                answer = Arrays.copyOfRange(str_list, 0, index);
                break;
            }
        }
        if (index == -1){
            return answer;
        }
        return answer;
    }
}
