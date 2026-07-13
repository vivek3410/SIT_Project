package Arrays;

import java.util.Scanner;

public class CheckPalindrome {
    
    static boolean helper(int[] arr){
        int size = arr.length;

        int left = 0;
        int right = size - 1;

        while(left < right){

            if(arr[left] != arr[right]){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean recursiveHelper(int[] arr,int left,int right){

        // base case left >= size or right <= 0
        if(left >= arr.length || right <= 0){
            return true;
        }

        if(arr[left] != arr[right]){
            return false;
        }

        return recursiveHelper(arr, left + 1, right - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        if(recursiveHelper(arr,0,arr.length-1)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

