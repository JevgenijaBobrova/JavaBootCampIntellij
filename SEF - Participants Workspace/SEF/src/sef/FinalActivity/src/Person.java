public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String introducePerson() {
        return "My name is " + name + " and I am " + age + " years old";
    }
}

