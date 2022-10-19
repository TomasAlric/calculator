package calculations.imc;

import java.math.BigDecimal;
import java.math.MathContext;

public class Imc {

    public BigDecimal calculate(BigDecimal weight, BigDecimal height){
        MathContext m = new MathContext(4);

        return weight.divide(height.pow(2), m);
    }

}
