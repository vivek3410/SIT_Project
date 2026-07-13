package Recurssion;

public class SumOfDigitsPalindrome {

    static int sum = 0;
    static int rev = 0;

    static void sumOfDigits(int n){
        if(n == 0) return;

        sum = sum + n % 10;

        sumOfDigits(n / 10);
    }

    static void reverse(int n){
        if(n == 0) return;

        rev = rev * 10 + n % 10;

        reverse(n / 10);
    }

    
    static boolean check(int n){

        sumOfDigits(n);

        reverse(sum);

        if(rev == sum){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        // long n = 99999999999994;
        int n = 13;

        System.out.println(check(n));

    }
}
