package calculations.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();

        var result = multiplication.calculate(2, 10);

        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMultiplicationWithNegativeNumber() {
        Multiplication multiplication = new Multiplication();

        var result = multiplication.calculate(2, -10);

        Assertions.assertEquals(-20, result);
    }

    @Test
    public void testMultiplicationWithDecimalNumber() {
        Multiplication multiplication = new Multiplication();

        var result = multiplication.calculate(2, 2.5);

        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testMultiplicationWithNegativeDecimalNumber() {
        Multiplication multiplication = new Multiplication();

        var result = multiplication.calculate(2, -2.5);

        Assertions.assertEquals(-5.0, result);
    }

    @Test
    public void testMultiplicationWithZero() {
        Multiplication multiplication = new Multiplication();

        var result = multiplication.calculate(2, 0);

        Assertions.assertEquals(0, result);
    }
}