package calculations.scientific;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {

    @Test
    public void testPower() {
        Power power = new Power();

        var result = power.calculate(4, 2);

        Assertions.assertEquals(16, result);
    }
}