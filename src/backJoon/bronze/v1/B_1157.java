package backJoon.bronze.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char answer = 'A';
        int max = Integer.MIN_VALUE;
        int index = -1;
        boolean isDuplicate = false;
        String a = br.readLine();
        a = a.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'A']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
                isDuplicate = false;
            }
            else if (arr[i] == max) {
                isDuplicate = true;
            }

        }
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + index));
        }
    }
}
