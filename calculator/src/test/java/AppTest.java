import calculations.basic.Division;
import calculations.basic.Multiplication;
import calculations.basic.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumWithZero() {

        Sum sum = new Sum();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sum.calculate(2, 0));
    }

    @Test
    public void testMultiplicationWithZero() {

        Multiplication multiplication = new Multiplication();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> multiplication.calculate(2, 0));
    }

    @Test
    public void testDivisionWithZero() {

        Division division = new Division();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> division.calculate(2, 0));
    }
}