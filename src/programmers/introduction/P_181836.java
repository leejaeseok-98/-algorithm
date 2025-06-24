package programmers.introduction;

import java.util.Arrays;

public class P_181836 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        Sol11 sol11 = new Sol11();
        System.out.println(Arrays.toString(sol11.solution(picture,k)));
    }
}

class Sol11{
    public String[] solution(String[] picture, int k){
        String[] answer = new String[picture.length*k];
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < picture.length; i++) {
            for (char c : picture[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    sb.append(c);
                }
            }
            String a = sb.toString();
            for (int j = 0; j < k; j++) {
                answer[cnt++] = a;
                sb.setLength(0); //sb 초기화
            }
        }
        return answer;
    }
}