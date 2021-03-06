package FirstActivity;

public class PersonCustomException {
    //Throws a custom exception with text "Custom exception - no numbers allowed in name"

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        person.setFirstName("Ivan3");
    }
}
