package programmers.introduction;

import java.util.Arrays;

public class CharacterCount {
    public static void main(String[] args) {
        String my_string = "Programmers";
        Solution19 solution19 = new Solution19();
        System.out.println(Arrays.toString(solution19.solution(my_string)));
    }
}
class Solution19 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++; // 대문자일 경우
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++; // 소문자일 경우
            }
        }

        return answer;
    }
}
