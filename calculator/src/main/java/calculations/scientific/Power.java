package calculations.scientific;

import rules.Calculable;

public class Power implements Calculable<Number> {

    @Override
    public Number calculate(double number1, double number2) {
        Number number;
        if (number1 % 1 == 0 && number2 % 1 == 0) {
            number = (int) Math.pow(number1, number2);
        } else {
            number = Math.pow(number1, number2);
        }
        return number;
    }
}
