import calculations.shapes.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    public void testArea() {

        Rectangle rectangle = new Rectangle();

        double expectedResult = 20;

        double result = rectangle.calculate(10, 2);


        Assertions.assertEquals(expectedResult, result);

    }
}