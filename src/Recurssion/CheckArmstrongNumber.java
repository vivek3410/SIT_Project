package Recurssion;

import java.util.Scanner;

public class CheckArmstrongNumber {
    
    static int result = 0;
    static int digitsCount = 0;

    public static void count(int n){
        if(n == 0) return;

        digitsCount++;

        count(n / 10);
    }

    public static void solution(int n){
        // logic

        if(n == 0) return;

        int digit = n % 10;
        result += Math.pow(digit, digitsCount);

        solution(n / 10);
    }

//         public static int solution(int n){
//             if(n == 0) return 0;
// 
//             return (int)Math.pow(n % 10, digitsCount) + solution(n / 10);
//         }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // couting digits
        count(n);

        // calculating the value as per armstrong rule
        solution(n);

        // checking armstrong number
        if(result == n){
            System.out.println("It is a Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }

      


    }
}
