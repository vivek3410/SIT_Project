package Recurssion;

import java.util.Scanner;

public class SumOfDigits {
    
    public static int sum = 0;

    public static void sumOfDigits(int n){
        if(n == 0) return;

        sum = sum + n % 10;

        sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        sumOfDigits(n);



        System.out.println(n);

        System.out.println(sum);
    }
}
