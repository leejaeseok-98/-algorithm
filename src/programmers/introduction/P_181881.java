package programmers.introduction;

public class P_181881 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,100,99,98};
        Solution37 sol = new Solution37();
        System.out.println(sol.solution(arr));
    }
}
class Solution37 {
    public int solution(int[] arr) {
        int n = 0;
        while (true) {
            boolean changed = false;
            int[] newArr = arr.clone();  // 변화 비교용

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                }
                if (newArr[i] != arr[i]) {
                    changed = true;
                }
            }

            if (!changed) {
                return n;
            }

            arr = newArr;
            n++;
        }
    }
}
