package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        int[][] intArr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," " );
            for (int j = 0; j < 9; j++) {
                intArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (intArr[i][j] > max) {
                    max = intArr[i][j];
                    row = i + 1 ;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
