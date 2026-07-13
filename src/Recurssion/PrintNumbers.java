package Recurssion;

import java.util.Scanner;

public class PrintNumbers {

    // SC: O(N) TC: O(N)
    public static void print(int n){
        // Base case
        if(n == 0) return;

        // logic
        System.out.print(n + " ");
        
        // Recursive call  
        print(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        print(n);
        System.out.println();
    }
}
