package programmers.basic;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class P_120852 {
    public static void main(String[] args) {
        int n = 12;
        P_120852_1 p = new P_120852_1();
        System.out.println(Arrays.toString(p.solution(n)));
    }
}
class P_120852_1{
    public int[] solution(int n){
        Set<Integer> set = new TreeSet<>(); // 오름차순 유지
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }
        return answer;
    }
}