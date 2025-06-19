package programmers.introduction;

import java.util.Arrays;
import java.util.Random;

public class P_181858 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,2,3};
        int k = 3;
        Solution49 sol = new Solution49();
        System.out.println(Arrays.toString(sol.solution(arr, k)));
    }
}
class Solution49 {
    public int[] solution(int[] arr, int k) {
        Random r = new Random();
        int[] answer = new int[k];
        int randomIndex = r.nextInt(arr.length);
        while (true) {
            if ()
        }
    }
}