package Recurssion;

import java.util.Scanner;

public class ReversingNumber {

    static int rev = 0;

    public static void reverse(int n){
        if(n == 0) return;

        int digit = n % 10;
        rev = (rev * 10) + digit;

        reverse(n / 10);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to reverse: ");
        int n = sc.nextInt();

        reverse(n);

        System.out.println(rev);

    }
}
