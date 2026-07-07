package day1;

import java.util.Scanner;

public class AuthenticationCheck {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pin = 1234;
        int attempts = 3;

        while(attempts > 0){
            System.out.print("Enter PIN to access locker: ");
            int input = sc.nextInt();

            if(input == pin){
                System.out.println("Access Granted!");
                break;
            }else{
                attempts--;

                if(attempts > 0){
                    System.out.println("Incorrect PIN. Try again.");
                }else{
                    System.out.println("Access Denied! Locker locked.");
                }
            }
        }

    }
}
