package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {5,3,4,1};

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
