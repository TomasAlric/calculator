package calculations.basic;

import rules.CalculationsWithValidation;

public class Division extends CalculationsWithValidation<Number> {

    @Override
    protected Number doCalculate(double number1, double number2) {
        Number number;
        if (number1 % number2 == 0) {
            number = (int) (number1 / number2);
        } else {
            number = number1 / number2;
        }
        return number;
    }
}
