package programmers.introduction;

public class ConcatenateCharacters {
    public static void main(String[] args) {
        String myString = "cvsgiorszzzmrpaqpe";
        int[] indexList = {16,6,5,3,12,14,11,11,17,12,7};
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.solution(myString, indexList));
    }
}

class Solution11 {
    public String solution(String myString, int[] indexList) {
        String answer = "";
        for (int i = 0; i < indexList.length; i++) {
            int n = indexList[i]; //문자열 자리수
            String s = myString.substring(n, n + 1);
            answer = answer + s;
        }
        return answer;
    }
}