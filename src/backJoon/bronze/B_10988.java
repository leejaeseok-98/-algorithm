package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String result = "";

        sb.append(input);
        sb.reverse();
        result = sb.toString();

        if (result.equals(input)) {
            System.out.print(1);
        }else {
            System.out.print(0);
        }
    }
}
