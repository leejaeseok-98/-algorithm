package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int zeroCnt = 0;
            int oneCnt = 0;
            int parm = Integer.parseInt(br.readLine());
            fibonacci(parm,zeroCnt,oneCnt);
            System.out.print(zeroCnt + " " + oneCnt);
            System.out.println();
        }

    }
    public static int fibonacci(int parm,int zeroCnt,int oneCnt) {
        if (parm == 0) {
            ++zeroCnt;
            return 0;
        }
        else if (parm == 1) {
            ++oneCnt;
            return 1;
        }
        else {
            return fibonacci(parm - 1,zeroCnt,oneCnt) + fibonacci(parm - 2,zeroCnt,oneCnt);
        }
    }
}
