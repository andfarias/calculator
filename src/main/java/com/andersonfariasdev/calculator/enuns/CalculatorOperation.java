package com.andersonfariasdev.calculator.enuns;

import com.andersonfariasdev.calculator.exception.InvalidOperationException;
import com.andersonfariasdev.calculator.strategy.*;

import java.util.Arrays;

public enum CalculatorOperation {
    ADDITION("+", new AdditionStrategy()),
    SUBTRACTION("-", new SubtractionStrategy()),
    MULTIPLICATION("*", new MultiplicationStrategy()),
    DIVISION("/", new DivisionStrategy());

    private final OperationStrategy operationStrategy;
    private final String operationValueValue;

    CalculatorOperation(String operationValueValue, OperationStrategy operationStrategy) {
        this.operationValueValue = operationValueValue;
        this.operationStrategy = operationStrategy;
    }

    public static CalculatorOperation fromCodigo(String codigo) throws InvalidOperationException {
        return Arrays.stream(values())
                .filter(element -> element.getOperationValue().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new InvalidOperationException("The operation " + codigo + " is not valid. Please"));
    }

    public OperationStrategy getOperationStrategy() {
        return operationStrategy;
    }

    public String getOperationValue() {
        return operationValueValue;
    }
}
