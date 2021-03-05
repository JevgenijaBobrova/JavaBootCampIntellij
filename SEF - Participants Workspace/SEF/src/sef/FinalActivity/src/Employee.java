public class Employee extends Person {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public void introduceEmployee() {
        System.out.println("My name is " + name + " and I am " + age +
                " years old. I work as a " + jobTitle + " in " + company);

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
