package Arrays;

import java.util.Scanner;

public class ArraysIO {

    public static int[] input(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


}
