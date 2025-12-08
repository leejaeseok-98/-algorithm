package backJoon.silver.v5;

import java.io.*;

public class B_10989 {
    public static int[] A;
    public static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Radix_Sort(A,5);
        for (int i = 0;i<n;i++){
            bw.write(A[i] + "\n");
        }
        bw.close();
        bw.flush();
    }

    public static void Radix_Sort(int[] A, int max_size){
        int[] output = new int[A.length];
        int jarisu = 1;
        int cnt = 0;
        while (cnt != max_size){
            int[] bucket = new int[10];
            for (int i = 0; i <A.length;i++){
                bucket[(A[i]/jarisu)%10]++;
            }
            for (int i = 1; i < 10;i++){
                bucket[i] += bucket[i-1];
            }
            for (int i = A.length-1; i >= 0; i--){
                output[bucket[A[i]/jarisu%10]-1] = A[i];
                bucket[(A[i]/jarisu)%10]--;
            }
            for (int i = 0; i <A.length;i++){
                A[i] = output[i];
            }
            jarisu = jarisu *10;
            cnt++;
        }
    }
}
