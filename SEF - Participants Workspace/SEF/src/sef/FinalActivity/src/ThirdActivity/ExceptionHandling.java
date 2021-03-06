package ThirdActivity;

import FirstActivity.CustomException;
import FirstActivity.Person;

public class ExceptionHandling extends Person {

    static Person person;

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }

        try {
            int[] numbers = {1, 2, 3, 4};
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds, please check");
        }

        try {
            person = new Person();
            person.setFirstName("Boris777");
        } catch (CustomException e) {
            System.out.println("No numbers are allowed in name");
        }

    }
}



