package calculations.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testRectangleArea() {

        Rectangle rectangle = new Rectangle();

        double expectedResult = 20;

        double result = rectangle.calculate(10, 2);


        Assertions.assertEquals(expectedResult, result);
    }
}