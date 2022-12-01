import Calculator.calculator;

import java.util.Scanner;

import static Calculator.calculator.OperationMenu;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("WELCOME TO USE MINI CALCULATOR");
        System.out.println("To Start please press Enter:");
        in.nextLine();


        OperationMenu();
        int operation = in.nextInt();

        switch (operation) {
            case 1 -> calculator.addition();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiplication();
            case 4 -> calculator.division();
            case 5 -> calculator.sin();
            case 6 -> calculator.cos();
            case 7 -> calculator.squareRoot();
            case 8 -> calculator.power();
            case 9 -> calculator.mod();
            default -> System.out.println("You enter the wrong operation number.");
        }

    }
}