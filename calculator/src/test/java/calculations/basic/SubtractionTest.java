package calculations.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();

        var result = subtraction.doCalculate(5, 4);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void testSubtractionWithNegativeNumber() {
        Subtraction subtraction = new Subtraction();

        var result = subtraction.doCalculate(10, -2);

        Assertions.assertEquals(12, result);
    }

    @Test
    public void testSubtractionWithDecimalNumber() {
        Subtraction subtraction = new Subtraction();

        var result = subtraction.doCalculate(10, -2.5);

        Assertions.assertEquals(12.5, result);
    }

    @Test
    public void testSubtractionWithNegativeDecimalNumber() {
        Subtraction subtraction = new Subtraction();

        var result = subtraction.doCalculate(15, -2.5);

        Assertions.assertEquals(17.5, result);
    }
}