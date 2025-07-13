package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            int temp = Integer.MAX_VALUE;
            if (i % 2 == 0) {
                temp = Math.min(temp, arr[i / 2] + 1);
            }
            if (i % 3 == 0) {
                temp = Math.min(temp, arr[i / 3] + 1);
            }
            if (true){
                temp = Math.min(temp, arr[i - 1] + 1);
            }
            arr[i] = temp;
        }
        System.out.println(arr[n]);
    }
}
