package rules;

import service.Validatable;

public abstract class CalculationsWithValidation<T> implements Calculable<T>, Validatable<Double> {

    public final T calculate(double number1, double number2) {
        if (isValid(number2)) {
            return doCalculate(number1, number2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected abstract T doCalculate(double number1, double number2);

    public boolean isValid(Double input) {
        return input != 0;
    }

}
