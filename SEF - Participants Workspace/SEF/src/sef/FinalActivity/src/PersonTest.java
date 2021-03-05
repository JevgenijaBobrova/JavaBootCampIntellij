
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void introducePerson() {
        Person person1 = new Person("Agent Smith", 45);
        assertEquals("My name is Agent Smith and I am 45 years old", person1.introducePerson());

        Person person2 = new Person("Erik", 30);
        assertEquals("My name is Erik and I am 30 years old", person2.introducePerson());


    }
}