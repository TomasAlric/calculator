package calculations.scientific;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {

    @Test
    public void testSquareRoot() {
        SquareRoot squareRoot = new SquareRoot();

        var result = squareRoot.calculate(16);

        Assertions.assertEquals(4, result);
    }
}