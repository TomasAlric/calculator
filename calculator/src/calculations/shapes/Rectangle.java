package calculations.shapes;

import rules.Formula;

public class Rectangle implements Formula {

    @Override
    public double calculate(double base, double height) {
        return base * height;
    }
}