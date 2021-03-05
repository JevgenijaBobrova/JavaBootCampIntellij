public class Person {

    String firstName;
    String secondName;
    int age;

 Person(){

 }

    public Person (String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String introducePerson() {
        return "My name is " + firstName + " " + secondName + " and I am " + age + " years old";
    }
}

