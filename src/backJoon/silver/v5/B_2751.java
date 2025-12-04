package backJoon.silver.v5;

import java.io.*;

public class B_2751 {
    static int[] arr;
    static int[] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        temp = new int[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(1,n);

        for (int i = 1; i <= n; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static void mergeSort(int s, int e){
        if (e-s < 1){
            return;
        }
        int m = s + (e-s)/2;
        mergeSort(s,m);
        mergeSort(m+1,e);

        for (int i =s; i <= e; i++){
            temp[i] = arr[i];
        }

        int k = s;
        int index1 = s;
        int index2 = m+1;

        while (index1 <= m && index2 <= e){
            if (temp[index1] < temp[index2]){
                arr[k] = temp[index1];
                k++;
                index1++;
            } else {
                arr[k] = temp[index2];
                k++;
                index2++;
            }
        }

        while (index1 <= m){
            arr[k] = temp[index1];
            k++;
            index1++;
        }
        while (index2 <= e){
            arr[k] = temp[index2];
            k++;
            index2++;
        }
    }
}
