package calculations.shapes;

import java.math.BigDecimal;
import java.math.MathContext;

public class Circle {

    public BigDecimal circleArea (BigDecimal radius){
        MathContext m = new MathContext(5);
        return (BigDecimal.valueOf(Math.PI).multiply(radius.pow(2)).round(m));
    }
}