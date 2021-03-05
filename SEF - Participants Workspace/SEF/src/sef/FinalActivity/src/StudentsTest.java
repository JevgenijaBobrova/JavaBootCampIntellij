import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsTest {


    @Test
    public void testIntroduceStudent() {
        Students student1 = new Students("Some College", "John", "Smith", 18);
        assertEquals("My name is John and I am 18 years old. I study in university Some College", student1.introduceStudent());

        Students student2 = new Students("Some Other College", "Boris", "Fischer", 22);
        assertEquals("My name is Boris and I am 22 years old. I study in university Some Other College", student2.introduceStudent());
    }
}
