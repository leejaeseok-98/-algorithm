package programmers.introduction;

public class ConcatenateSubstringsToCreate {
    public static void main(String[] args) {
        String[] my_strings = {"progressive","hamburger","hammer","ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution(my_strings, parts));
    }
}
class Solution15{
    public String solution(String[] my_strings,int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            int s = 0;
            int e = 0;
            for (int j = 0; j < parts.length; j++) {
                if (i == j){
                    s = parts[j][0];
                    e = parts[j][1];
                }
            }
            String str = my_strings[i];
            answer += str.substring(s,e+1);
        }
        return answer;
    }
}