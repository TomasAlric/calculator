package calculations.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CircleTest {

    @Test
    public void testCircle() {
        Circle circle = new Circle();
        var result = circle.circleArea(BigDecimal.valueOf(15));

        Assertions.assertEquals(BigDecimal.valueOf(706.86), result);
    }
}