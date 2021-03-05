public class Employee extends Person {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee() {

    }

    public Employee(String firstName, String secondName, int age, String jobTitle, String company, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String introduceEmployee() {
        return "My name is " + firstName + " " + secondName + " and I am " + age +
                " years old. I work as a " + jobTitle + " in " + company;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
