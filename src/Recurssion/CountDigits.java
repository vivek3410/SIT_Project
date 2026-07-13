package Recurssion;

import java.util.Scanner;

public class CountDigits {

    public static int count = 0;

    public static void countDigits(int n){
        // logic
        if(n == 0) return;
        count++;
        countDigits(n / 10);
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        countDigits(n);

        System.out.println(count);

    }
}
