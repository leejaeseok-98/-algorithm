package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Object> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); //출력 위치

        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                list.add(i);
            }

        }
        if (list.size() >= k) {
            System.out.println(list.get(k-1));
        } else if (list.size() < k) {
            System.out.println(0);
        }
    }
}
