package com.menu;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu availableMenuOptions =  new Menu();
        System.out.print("Would like to Start: Yes or No: ");
        String start = input.next();
        String answerYes = "Yes";
        while (answerYes.equalsIgnoreCase(start)) {

            System.out.print("Enter Number1: ");
            int num1 = input.nextInt();
            System.out.print("Enter Number2: ");
            int num2 = input.nextInt();
            availableMenuOptions.printOptions();
            int option = input.nextInt();

            int total = switch (option) {
                case 1 -> availableMenuOptions.add(num1, num2);
                case 2 -> availableMenuOptions.subtract(num1, num2);
                case 3 -> availableMenuOptions.divide(num1, num2);
                case 4 -> availableMenuOptions.multiply(num1, num2);
                default -> 0;
            };

            System.out.printf("Here are the options you choose\nNumber1:%d \nNumber2: %d\nChoice: %d \nResult: %d ", num1, num2, option, total);
            System.out.println("would you like start over? Yes or No: ");
            start = input.next();
        }

    }
}
