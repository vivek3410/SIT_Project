package day1;

import java.util.Scanner;

public class LeapYear {
    

    public static boolean solution(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter the end year");
        int end = sc.nextInt();

        for(int i = start;i<=end;i++){
            if(solution(i)){
                System.out.print(i + " ");
            }
        }  
    }
}
