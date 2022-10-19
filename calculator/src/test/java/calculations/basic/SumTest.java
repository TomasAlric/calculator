package calculations.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void testSum() {
        Sum sum = new Sum();

        var result = sum.doCalculate(1, 2);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSumWithNegativeNumber() {
        Sum sum = new Sum();

        var result = sum.doCalculate(10, -2);

        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSumWithDecimalNumber() {
        Sum sum = new Sum();

        var result = sum.doCalculate(10, 2.5);

        Assertions.assertEquals(12.5, result);
    }

    @Test
    public void testSumWithNegativeDecimalNumber() {
        Sum sum = new Sum();

        var result = sum.doCalculate(15, -2.5);

        Assertions.assertEquals(12.5, result);
    }
}