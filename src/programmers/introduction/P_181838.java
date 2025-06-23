package programmers.introduction;

public class P_181838 {
    public static void main(String[] args) {
        int[] date1 = {1025, 2, 24};
        int[] date2 = {1024, 11, 24};

        Sol9 sol9 = new Sol9();
        System.out.println(sol9.solution(date1, date2));
    }
}
class Sol9 {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) return 1; // date1이 더 과거
            if (date1[i] > date2[i]) return 0; // date1이 더 미래
        }
        return 0; // 동일한 날짜
    }
}
