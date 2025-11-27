package backJoon.silver.v5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String log = st.nextToken();
            if (log.equals("enter")){
                set.add(name);
            } else if(log.equals("leave")){
                set.remove(name);
            }
        }
        while (!set.isEmpty()) {
            System.out.println(set.pollLast());
        }

    }
}
