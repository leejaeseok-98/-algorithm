package backJoon.silver.v5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean check = check(s);
            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    public static boolean check(String s) {
        boolean[] checkBoolean = new boolean[26];
        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i) - 'a';
            if ( prev != now) {
                if (checkBoolean[now]) {
                    return false;
                }
                checkBoolean[now] = true;
                prev = now;
            }
        }
        return true;
    }
}
