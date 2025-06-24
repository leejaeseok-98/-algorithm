package programmers.introduction;

import com.sun.jdi.PathSearchingVirtualMachine;

public class p_181831 {
    public static void main(String[] args) {
//        int[][] arr = {{5, 192, 33},{192, 72, 95},{33, 95, 999}};
        int[][] arr = {{19, 498, 258, 587},{63, 93, 7, 754},{258, 7, 1000, 723},{587, 754, 723, 81}};
        Sol14 sol = new Sol14();
        System.out.println(sol.solution(arr));
    }
}
class Sol14{
    public int solution(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
