import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculatorTest {

    SumCalcumator sumCalculator;
    @Before
    public void setUp() {

        sumCalculator = new SumCalcumator();
    }

    @Test
    public void testCorrectSum() {

        int result = sumCalculator.getSumOfNumbers(1, 10);
        int expectedResult = 55;
        assertEquals(expectedResult, result);
    }

    @Test(expected=ArithmeticException.class)
    public void testIncorrectArgumentsSum(){

        int result = sumCalculator.getSumOfNumbers(10, 1);
    }
}
