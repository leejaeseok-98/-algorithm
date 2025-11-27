package backJoon.bronze.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        int mid = 0;
        for (int i = 0; i <5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/5);
        System.out.println(arr[(arr.length-1)/2]);


    }

    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++){
            if (arr[j] <= pivot){
                i = i + 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
