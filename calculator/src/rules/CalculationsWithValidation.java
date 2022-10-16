package rules;

import service.Validatable;

public abstract class CalculationsWithValidation implements Calculable, Validatable<Integer> {

    public final int calculate(int number1, int number2) {
        if (isValid(number2)) {
            return doCalculate(number1, number2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected abstract int doCalculate(int number1, int number2);

    public boolean isValid(Integer input) {
        return input != 0;
    }

}
