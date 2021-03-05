import java.util.Arrays;
import java.util.Comparator;

public class FirstActivity {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Smith", 26, "Developer", "ABCompany", 1300);
        Employee employee2 = new Employee("Anna", "Johnson", 33, "Tester", "ABCompany", 1100);
        Employee employee3 = new Employee("Sarah", "Parker", 36, "Senior Developer", "ABCompany", 2000);
        Employee employee4 = new Employee("Alex", "Williams", 22, "Junior Tester", "ABCompany", 900);

        Employee[] employees = {employee1, employee2, employee3, employee4};
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Employee list according to salaries (from high to low):");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].firstName + " " + employees[i].secondName + ", " + employees[i].getSalary());
        }


    }
}



