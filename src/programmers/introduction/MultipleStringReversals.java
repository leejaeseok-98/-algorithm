package programmers.introduction;

public class MultipleStringReversals {
    public static void main(String[] args) {
        String myString = "rermgorpsam";
        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};

        Solution13 solution13 = new Solution13();
        System.out.println(solution13.solution(myString, queries));
    }
}

class Solution13 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        return new String(arr);
    }
}