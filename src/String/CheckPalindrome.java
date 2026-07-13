package String;

import java.util.Scanner;

public class CheckPalindrome {

    static boolean helper(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean recursiveHelper(String str,int left ,int right){

        if(left >= right){
            return true;
        }

        if(str.charAt(left) != str.charAt(right)){
            return false;
        }

        return recursiveHelper(str, left + 1, right - 1);
    }
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a string: ");
        // String str = sc.next();


        // String s = "trainer";

        // System.out.println(s.substring(1,4));

        // if(recursiveHelper(str,0,str.length()-1)){
        //     System.out.println("It is a palindrome");
        // }else{
        //     System.out.println("Not a palindrome");
        // }

    }
}
