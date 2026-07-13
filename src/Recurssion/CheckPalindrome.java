package Recurssion;

import java.util.Scanner;

public class CheckPalindrome {

    static int rev = 0;

    public static void reverse(int n){
        if(n == 0) return;

        int digit = n % 10;
        rev = (rev * 10) + digit;

        reverse(n / 10);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        reverse(n);

        if(rev == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
