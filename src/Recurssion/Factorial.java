package Recurssion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        // logic
        // base case
        if(n == 1 || n == 0){
            return 1;
        }

        // Recursive call
        return n * factorial(n-1);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println(result);
    }
}
