package com.menu;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu availableMenuOptions =  new Menu();

        System.out.print("Enter Number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = input.nextInt();
        availableMenuOptions.printOptions();
        int option = input.nextInt();

        int total = 0;

        switch (option) {
            case 1:
                total = availableMenuOptions.add(num1, num2);
                break;
            case 2:
                total = availableMenuOptions.subtract(num1, num2);
                break;
            case 3:
                total = availableMenuOptions.divide(num1, num2);
                break;
            case 4:
                total = availableMenuOptions.multiply(num1, num2);
                break;
            default:
                total = 0;
        }

        System.out.printf("Here are the options you choose\nNumber1:%d \nNumber2: %d\nChoice: %d \nResult: %d ", num1, num2, option, total);


    }
}
