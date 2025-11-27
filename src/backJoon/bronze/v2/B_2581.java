package backJoon.bronze.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        int minNum = Integer.MAX_VALUE;

        for (int i = min; i <= max; i++) {
            for (int j = 2; j <= max/2; j++) {
                if (i % j == 0) {
                    break;
                }else {
                    minNum = Math.min(minNum, i);
                }
                if (j == max/2){
                    sum += i;
                }
                if (minNum < 0){
                    System.out.println(-1);
                    return;
                }
                else {
                    System.out.println(sum);
                    System.out.println(minNum);
                    return;
                }
            }
        }
    }
}
