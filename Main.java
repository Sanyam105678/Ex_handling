package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            int num2 = sc.nextInt();


            String message = null;

            try {
                int num3 = num1 / num2;
                if (num3 > 10) {
                    message = "Welcome to Exception Handling ";
                    System.out.println("Message is :"+message.toUpperCase());
                }
                else{
                    throw new RuntimeException();
                }
            }
            catch (ArithmeticException eo){
                System.out.println("num2 should not be 0");
            }
            catch (RuntimeException ex){
                System.out.println("String value is null");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid number");
        }









        System.out.println("end of main");
    }
}



