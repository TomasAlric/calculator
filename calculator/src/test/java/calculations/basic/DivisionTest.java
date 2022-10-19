package calculations.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testDivision() {
        Division division = new Division();

        var result = division.doCalculate(10, 5);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivisionWithNegativeNumber() {
        Division division = new Division();

        var result = division.doCalculate(10, -2);

        Assertions.assertEquals(-5, result);
    }

    @Test
    public void testDivisionWithDecimal() {
        Division division = new Division();

        var result = division.doCalculate(2, 10);

        Assertions.assertEquals(0.2, result);
    }

    @Test
    public void testDivisionWithNegativeDecimal() {
        Division division = new Division();

        var result = division.doCalculate(10, -2.5);

        Assertions.assertEquals(-4, result);
    }
}