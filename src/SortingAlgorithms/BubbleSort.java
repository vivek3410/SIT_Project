package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    static void solution(int[] arr){

        int n = arr.length;
        // TC: O(N^2)
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {5,3,4,1};

        System.out.println(Arrays.toString(arr));

        solution(arr);

        System.out.println(Arrays.toString(arr));



    }
}
