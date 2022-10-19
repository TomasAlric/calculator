package calculations.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void squareArea() {
        Square square = new Square();

        var result = square.squareArea(4);

        Assertions.assertEquals(16, result);
    }
}