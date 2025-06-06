package programmers.introduction;

import java.util.Arrays;

public class RemoveCharacters {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1,16,6,15,0,10,11,3};

        Solution21 solution = new Solution21();
        System.out.println(solution.solution(my_string, indices));
    }
}
class Solution21 {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        int n = 0;
        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(indices[i] - n);
            ++n;
        }
        return sb.toString();
    }
}
