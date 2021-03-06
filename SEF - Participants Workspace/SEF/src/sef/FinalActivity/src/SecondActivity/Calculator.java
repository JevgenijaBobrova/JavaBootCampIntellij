package SecondActivity;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;

    }

    public double divide(int x, int y) {
        double div = 0;
        try {
            div = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation, you should not divide a number by zero");
        }
        return div;


    }
}

