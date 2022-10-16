package calculations.basic;

import rules.CalculationsWithValidation;

public class Subtraction extends CalculationsWithValidation {

    @Override
    protected int doCalculate(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public boolean isValid(Integer input) {
        return input > 0;
    }
}