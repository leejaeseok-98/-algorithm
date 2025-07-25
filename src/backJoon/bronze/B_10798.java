package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] charArr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            int k = 0;
            for(char c : str.toCharArray()) {
                charArr[i][k] = c;
                k++;
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (charArr[j][i] != '\0') { //char배열에서 null을 나타내는 것
                    sb.append(charArr[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
