package FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person();

    @Test
    public void testIntroducePerson() {
        Person person1 = new Person("Agent", "Smith", 45);
        assertEquals("My name is Agent Smith and I am 45 years old", person1.introducePerson());

        Person person2 = new Person("Erik", "Watson", 30);
        assertEquals("My name is Erik Watson and I am 30 years old", person2.introducePerson());

    }

    @Test(expected = CustomException.class)
    public void setFirstNameWithNumbers() throws CustomException {
        person.setFirstName("Anna3");
    }

    @Test
    public void setFirstName() throws CustomException {
        person.setFirstName("Anna");
    }


    @Test(expected = CustomException.class)
    public void setSecondNameWithNumbers() throws CustomException {
        person.setSecondName("Williams777");
    }

    @Test
    public void setSecondName() throws CustomException {
        person.setSecondName("Williams");
    }

}