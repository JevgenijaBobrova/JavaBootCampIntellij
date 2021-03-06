package SecondActivity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(10, calculator.add(8,2));
        Assert.assertEquals(2, calculator.add(-4,6));
    }

    @Test
    public void subtract() {
        Assert.assertEquals(6, calculator.subtract(8,2));
        Assert.assertEquals(1, calculator.subtract(-2,-3));
    }

    @Test
    public void multiply() {
        Assert.assertEquals(6, calculator.multiply(2,3));
        Assert.assertEquals(-8, calculator.multiply(4,-2));
    }

    @Test
    public void divide() {
        Assert.assertEquals(6.00, calculator.divide(12,2), 0);
        Assert.assertEquals(0.00, calculator.divide(12,0), 0);
    }
}