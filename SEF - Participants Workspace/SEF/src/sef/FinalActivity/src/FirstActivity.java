import java.util.Arrays;
import java.util.Collections;

public class FirstActivity {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 26, "Developer", "ABCompany", 1300);
        System.out.println(employee1.introduceEmployee());
        Employee employee2 = new Employee("Anna", 33, "Tester", "ABCompany", 1100);
        System.out.println(employee2.introduceEmployee());
        Employee employee3 = new Employee("Sarah", 36, "Senior Developer", "ABCompany", 2000);
        System.out.println(employee3.introduceEmployee());
        Employee employee4 = new Employee("Alex", 22, "Junior Tester", "ABCompany", 900);
        System.out.println(employee4.introduceEmployee());
        System.out.println("---------------------------------");

        Integer[] employeeSalary = {employee1.getSalary(), employee2.getSalary(), employee3.getSalary(), employee4.getSalary()};
        Arrays.sort(employeeSalary, Collections.reverseOrder());
        System.out.println("The employee salaries from highest to lowest:");
        for (int i = 0; i < employeeSalary.length; i++) {
            System.out.println(employeeSalary[i]);

        }
    }
}

