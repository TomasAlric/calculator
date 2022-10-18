package calculations.basic;

import rules.CalculationsWithValidation;

public class Subtraction extends CalculationsWithValidation<Number> {

    @Override
    public boolean isValid(Double input) {
        return input > 0;
    }

    @Override
    protected Number doCalculate(double number1, double number2) {
        Number number;
        if (number1 % 1 == 0 && number2 % 1 == 0) {
            number = (int) (number1 - number2);
        } else {
            number = number1 - number2;
        }
        return number;
    }
}