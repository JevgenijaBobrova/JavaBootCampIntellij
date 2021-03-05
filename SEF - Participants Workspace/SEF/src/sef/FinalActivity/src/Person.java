public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void introducePerson() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}

