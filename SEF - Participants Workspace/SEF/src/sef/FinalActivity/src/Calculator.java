public class Calculator {

    private double add(int x, int y) {
        double sum = x + y;
        return sum;
    }

    private double subtract(int x, int y) {
        double diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }

    private double multiply(double[] numbers) {
        double mult = 1;

        for (int i = 0; i < numbers.length; i++) {
            mult = mult * numbers[i];
        }
        return mult;

    }

    private double divide(int x, int y) {
        double div = 0;
        //if (x == 0 || y == 0) {
        //	if ((x == 0) & (y != 0)) {
        //	divValue = 0;
        //	} else {
        //		System.out.println("Error - division by 0");
        //}
        if (y == 0) {
            System.out.println("Error - division by 0");
        } else {
            div = x / y;
        }
        return div;

    }
}
