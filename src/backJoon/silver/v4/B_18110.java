package backJoon.silver.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class B_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);


        int exclusionCount = (int) Math.round(n * 0.15);


        long sum = 0;
        for (int i = exclusionCount; i < n - exclusionCount; i++) {
            sum += scores[i];
        }

        int remainingCount = n - (2 * exclusionCount);
        int result = (int) Math.round((double) sum / remainingCount);

        System.out.println(result);


    }
}
