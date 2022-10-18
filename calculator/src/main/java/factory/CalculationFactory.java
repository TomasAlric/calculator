package factory;

import calculations.basic.Division;
import calculations.basic.Multiplication;
import calculations.basic.Subtraction;
import calculations.basic.Sum;
import rules.Calculable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CalculationFactory {

    Map<String, Calculable<Number>> operationMap;

    public CalculationFactory() {
        operationMap = new HashMap<>();
        operationMap.put("+", new Sum());
        operationMap.put("-", new Subtraction());
        operationMap.put("*", new Multiplication());
        operationMap.put("/", new Division());
    }

    public Calculable<Number> create(String operation) {
        return Optional.ofNullable(operationMap.get(operation)).orElseThrow(RuntimeException::new);
    }
}
