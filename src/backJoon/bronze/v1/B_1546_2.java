package backJoon.bronze.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1546_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Double[] arr = new Double[testNum];
        Double max = 0.0;

        for (int i = 0; i < testNum; i++){
            arr[i] = Double.valueOf(st.nextToken());
            if (max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < testNum; i++){
            arr[i] = (arr[i] * 100) / max;
        }

        Double result = 0.0;

        for (int i = 0; i < testNum; i++){
            result += arr[i];
        }

        System.out.println(result / testNum);




    }
}
