package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySlicing {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        Solution26 sol = new Solution26();
        System.out.println(Arrays.toString(sol.solution(arr, query)));
    }
}
class Solution26 {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0){
                arr = Arrays.copyOfRange(arr, 0,query[i]+1);
            } else{
                //i버째 인덱스부터 끝까지 남김
                arr = Arrays.copyOfRange(arr, query[i],arr.length);
            }
        }
        return arr;
    }
}
