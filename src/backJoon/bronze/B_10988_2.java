package backJoon.bronze;

import java.io.IOException;
import java.util.Scanner;

public class B_10988_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;

        for(int i=0;i<len/2;i++) {
            if(str.charAt(i)!=str.charAt(len-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
