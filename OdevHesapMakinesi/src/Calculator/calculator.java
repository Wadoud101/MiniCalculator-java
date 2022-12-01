package Calculator;

import java.util.Scanner;

public class calculator {

    public static void OperationMenu(){
        System.out.println("  Please choose an Operation");
        System.out.println("|----------------------------|");
        System.out.println("|Choose 1) for Addition      |");
        System.out.println("|Choose 2) for Subtraction   |");
        System.out.println("|Choose 3) for Multiplication|");
        System.out.println("|Choose 4) for Division      |");
        System.out.println("|Choose 5) for Sin(x)        |");
        System.out.println("|Choose 6) for Cos(x)        |");
        System.out.println("|Choose 7) for Square root   |");
        System.out.println("|Choose 8) for Power of a^b  |");
        System.out.println("|Choose 9) for ReminderOf a/b|");
        System.out.println(" ----------------------------");

    }

    public static double addition(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose Addition;");
        System.out.println("Please enter first number:");
        double num1 = in.nextDouble();

        System.out.println("Please enter second number:");
        double num2 = in.nextDouble();

        double result = num1 + num2;
        System.out.println("Your result is: ( " + result +" )");
        return result;
    }

    public static double subtraction(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose Subtraction;");
        System.out.println("Please enter first number:");
        double num1 = in.nextDouble();

        System.out.println("Please enter second number:");
        double num2 = in.nextDouble();

        double result = num1 - num2;
        System.out.println("Your result is: ( " + result + " )");
        return result;
    }

    public static double multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose Multiplication;");
        System.out.println("Please enter first number:");
        double num1 = in.nextDouble();

        System.out.println("Please enter second number:");
        double num2 = in.nextDouble();

        double result = num1 * num2;
        System.out.println("Your result is: ( " + result + " )");
        return result;
    }

    public static double division(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose Division;");
        System.out.println("Please enter first number:");
        double num1 = in.nextDouble();

        System.out.println("Please enter second number:");
        double num2 = in.nextDouble();

        if(num2 != 0) {
            double result = num1 / num2;
            System.out.println("Your result is: ( " + result + " )");

        }else{
            System.out.println("Number cant be divided by 0 !!!!");

        }
        return num1;

    }

    public static double sin(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose sin of a  degree;");
        System.out.println("Please enter a degree:");
        double num1 = in.nextDouble();
        double num2 = Math.toRadians(num1);

        System.out.println("sin of ( " + num1 + " ) degree is ( " + Math.sin(num2) +" )");
        return num2;
    }

    public static double cos(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose cos of a  degree;");
        System.out.println("Please enter a degree:");
        double num1 = in.nextDouble();
        double num2 = Math.toRadians(num1);

        System.out.println("sin of ( " + num1 + " ) degree is ( " + Math.cos(num2) +" )");
        return num2;
    }

    public static double squareRoot(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose the square root;");
        System.out.println("Please enter a number:");
        double num1 = in.nextDouble();

        System.out.println("The square root of ( " + num1 + " ) is equals to ( " + Math.sqrt(num1) +" )");
        return num1;
    }

    public static double power(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose (a) to the power of (b);");
        System.out.println("Please enter (a):");
        double num1 = in.nextDouble();

        System.out.println("Please enter (b):");
        double num2 = in.nextDouble();

        double result = Math.pow(num1, num2);
        System.out.println("( " + num1 + " )" + " to the power of ( " + num2 + " ) is equals to ( " + result + " )");
        return result;
    }

    public static double mod(){
        Scanner in = new Scanner(System.in);
        System.out.println("You choose to find the Remainder of a division;");
        System.out.println("Please enter Dividend:");
        double num1 = in.nextDouble();

        System.out.println("Please enter Divisor:");
        double num2 = in.nextDouble();

        double result;
        result = num1 % num2;
        System.out.println("The remainder of ( " + num1 + " ) divided by ( " + num2 + " ) is equals to : ( " + result +" )");
        return result;
    }
}
