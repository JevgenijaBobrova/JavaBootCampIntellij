package SecondActivity;

import java.util.Scanner;

public class CalculatorWithUI extends Calculator {

    public static void main(String[] args) {

        int x;
        int y;
        char operator;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (int):");
        x = scanner.nextInt();

        System.out.print("Enter second number (int):");
        y = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println("Result = " + (calculator.add(x, y)));
                break;

            case '-':
                System.out.println("Result = " + (calculator.subtract(x, y)));
                break;

            case '*':
                System.out.println("Result = " + (calculator.multiply(x, y)));
                break;

            case '/':
                System.out.println("Result = " + (calculator.divide(x, y)));
                break;

            default:
                System.out.println("Invalid operator");


        }
    }
}
