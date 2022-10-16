package calculations.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {

        Rectangle rectangle = new Rectangle();

        double expectedResult = 20;

        double result = rectangle.calculate(10, 2);


        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    public void testAreaError(){

        Rectangle rectangle = new Rectangle();

        double expectedResult = 30;

        double result = rectangle.calculate(10, 2);

        Assertions.assertNotEquals(expectedResult, result);

    }

    @Test
    public void testAreaInstance(){
        Rectangle rectangle = new Rectangle();

        Assertions.assertInstanceOf(Rectangle.class, rectangle);

    }

    @Test
    public void testAreaNotNull(){

        Rectangle rectangle = new Rectangle();

        Assertions.assertNotNull(rectangle);

    }
}
