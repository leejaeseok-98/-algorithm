package backJoon.silver.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        StringBuilder sb = new StringBuilder();
        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            String[] str1 = br.readLine().split(" ");
            map.put(str1[0], str1[1]);
        }
        for (int i = 0; i < m; i++){
            sb.append(map.get(br.readLine())).append("\n");
        }
        System.out.println(sb.toString());
    }
}
