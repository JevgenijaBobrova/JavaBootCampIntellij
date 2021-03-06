package FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employee1 = new Employee("Liene", "Ozola", 28, "Developer", "Some Company", 1000);
    Employee employee2 = new Employee("Boris", "Johnson", 34, "Tester", "Some Other Company", 950);
    Employee employee3 = new Employee();


    @Test
    public void testIntroduceEmployee() {
        assertEquals("My name is Liene Ozola and I am 28 years old. I work as a Developer in Some Company", employee1.introduceEmployee());
        assertEquals("My name is Boris Johnson and I am 34 years old. I work as a Tester in Some Other Company", employee2.introduceEmployee());

    }

    @Test
    public void testGetterJobTitle() {
        assertEquals("Developer", employee1.getJobTitle());
        assertEquals("Tester", employee2.getJobTitle());

    }

    @Test
    public void testSetterJobTitle() {
        employee3.setJobTitle("Senior Developer");
        assertEquals("Senior Developer", employee3.getJobTitle());

    }

    @Test
    public void testGetterCompany() {
        assertEquals("Some Company", employee1.getCompany());
    }

    @Test
    public void testSetterCompany() {
        employee3.setCompany("Bite");
        assertEquals("Bite", employee3.getCompany());
    }

    @Test
    public void testGetterSalary() {
        assertEquals(1000, employee1.getSalary());
    }


    @Test
    public void testSetterSalary() {
        employee3.setSalary(1800);
        assertEquals(1800, employee3.getSalary());
    }
}