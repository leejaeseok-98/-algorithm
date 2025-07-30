package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());//숫자 카드의 개수
        Set<Integer> set = new HashSet<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine()); //숫자 카드에 적혀있는 수
        st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                System.out.print(1 + " ");
            }else {
                System.out.print(0 + " ");
            }
        }
    }
}
