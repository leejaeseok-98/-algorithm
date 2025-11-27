package backJoon.bronze.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            isPalindrome(s);
        }

    }
    public static int isPalindrome(String s) {
        int cnt = 0;
        return recursion(s, 0, s.length()-1,cnt);
    }
    public static int recursion(String s, int l, int r, int cnt) {
        cnt++;
        if (l >= r) {
            System.out.println( "1 " + cnt );
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            System.out.println( "0 " + cnt);
            return 0;
        } else {
            return recursion(s, l+1, r-1, cnt);
        }
    }
}
