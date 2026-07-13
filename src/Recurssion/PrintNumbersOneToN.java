package Recurssion;

import java.util.Scanner;

public class PrintNumbersOneToN {

    public static void print(int n){
        // base case
        if(n == 0) return;

        // Recursive call
        print(n-1);

        System.out.print(n + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        print(n);

        System.out.println();
    }
}
