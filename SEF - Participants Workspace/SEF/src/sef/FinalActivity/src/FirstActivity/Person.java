package FirstActivity;

public class Person {
    // Please see task 8. below. I have created two methods to make sure names don't contain letters.
    // The method that demonstrates the custom exception in action is in FirstActivity.PersonCustomException.
    // Tests are in FirstActivity.PersonTest.

    String firstName;
    String secondName;
    int age;


    public Person() {

    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String introducePerson() {
        return "My name is " + firstName + " " + secondName + " and I am " + age + " years old";
    }

    public void setFirstName(String firstName) throws CustomException {
        char[] charsFirstName = firstName.toCharArray();
        for (int i = 0; i < charsFirstName.length; i++) {
            if (!Character.isLetter(charsFirstName[i])) {
                throw new CustomException();
            } else {
                this.firstName = firstName;
            }
        }
    }

    public void setSecondName(String secondName) throws CustomException {
        char[] charsSecondName = secondName.toCharArray();
        for (int i = 0; i < charsSecondName.length; i++) {
            if (!Character.isLetter(charsSecondName[i])) {
                throw new CustomException();
            } else {
                this.secondName = secondName;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}



