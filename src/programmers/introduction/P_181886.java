package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181886 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        Solution35 sol = new Solution35();
        System.out.println(Arrays.toString(sol.solution(names)));
    }
}
class Solution35{
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < names.length; i = i+5){
            list.add(names[i]);
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}