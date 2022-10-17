package calculations.scientific;

import rules.Calculable;

public class Power implements Calculable {
    @Override
    public int calculate(int number1, int number2) {
        double result = Math.pow(number1, number2);
        return (int) result;
    }
}
