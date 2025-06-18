package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_181870 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        Solution42 solution = new Solution42();
        System.out.println(Arrays.toString(solution.solution(strArr)));
    }
}
class Solution42 {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length()-1; j++) {
                if (strArr[i].startsWith("ad",j)){
                    list.remove(strArr[i]);
                }
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
