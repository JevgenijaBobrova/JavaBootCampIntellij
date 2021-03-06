package FirstActivity;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class FirstActivity { //contains Bonus tasks Nr. 2, 4.


    static Employee employee1 = new Employee("John", "Smith", 26, "Developer", "ABCompany", 1300);
    static Employee employee2 = new Employee("Anna", "Johnson", 33, "Tester", "ABCompany", 1100);
    static Employee employee3 = new Employee("Sarah", "Parker", 36, "Senior Developer", "ABCompany", 2000);
    static Employee employee4 = new Employee("Alex", "Williams", 22, "Junior Tester", "ABCompany", 900);
    static Employee[] employees = {employee1, employee2, employee3, employee4};

    public static void main(String[] args) {
        sortBySalaryAsc();
        System.out.println("----------------------");
        printToFile();
        System.out.println("----------------------");
        sortByFirstNameAsc();
        System.out.println("----------------------");
        sortBySecondNameAsc();

    }

    public static void sortBySalaryAsc() {
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Employee list according to salaries (from high to low):");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstName + " " + employees[i].secondName);
        }
    }

    public static void printToFile()  {
        try (PrintWriter out = new PrintWriter("Employees.txt")) {
            for (int i = 0; i < employees.length; i++) {
                out.println(employees[i].firstName + " " + employees[i].secondName);
            }
                System.out.println("Printed to file successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void sortByFirstNameAsc() {
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Employee list by first name in ascending order: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstName + " " + employees[i].secondName);
        }

    }

    public static void sortBySecondNameAsc() {
        Arrays.sort(employees, Comparator.comparing(Employee::getSecondName));
        System.out.println("Employee list by second name in ascending order: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstName + " " + employees[i].secondName);
        }
    }
}



