package backJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1546 {
    public static void main(String[] args) throws IOException {
        int maxNum = Integer.MIN_VALUE;
        Double answer = 0.0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력받는 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        Double[] arr2 = new Double[n];

        for (int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        for (int i = 0; i < n; i++){
            arr2[i] = (double)arr[i]/maxNum*100;
            answer += arr2[i];
        }
        answer/=n;
        System.out.println(answer);
    }
}
