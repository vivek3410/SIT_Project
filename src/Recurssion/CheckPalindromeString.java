package Recurssion;

import java.util.Scanner;

public class CheckPalindromeString {

    static boolean isPalindrome(String s){


        if(s.length() <= 1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length() -1 )) return false;

        return isPalindrome(s.substring(1,s.length()-1));
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();

        if(isPalindrome(s)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
