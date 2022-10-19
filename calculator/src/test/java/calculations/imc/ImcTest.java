package calculations.imc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ImcTest {

    @Test
    public void testImc() {
        Imc imc = new Imc();

        var result = imc.calculate(BigDecimal.valueOf(56.0), BigDecimal.valueOf(1.70));

        Assertions.assertEquals(BigDecimal.valueOf(19.38), result);
    }
}