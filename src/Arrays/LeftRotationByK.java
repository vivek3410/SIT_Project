package Arrays;

import java.util.Scanner;

public class LeftRotationByK {

    public static void reverse(int[] arr,int start,int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void solution(int[] arr,int k){
        k = k % arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        solution(arr,k);

        ArraysIO.display(arr);  
    }
}
