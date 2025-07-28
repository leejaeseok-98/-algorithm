package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class B_2750 {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            treeSet.add(Integer.parseInt(br.readLine()));
        }
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
}
