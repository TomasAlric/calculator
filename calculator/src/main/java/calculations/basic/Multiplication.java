package calculations.basic;

import rules.Calculable;

public class Multiplication implements Calculable<Number> {

    @Override
    public Number calculate(double number1, double number2) {
        Number number;
        if (number1 % 1 == 0 && number2 % 1 == 0) {
            number = (int) (number1 * number2);
        } else {
            number = number1 * number2;
        }
        return number;
    }
}