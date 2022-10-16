package calculations.basic;

import rules.CalculationsWithValidation;

public class Sum extends CalculationsWithValidation {

    @Override
    protected int doCalculate(int number1, int number2) {
        return number1 + number2;
    }

}