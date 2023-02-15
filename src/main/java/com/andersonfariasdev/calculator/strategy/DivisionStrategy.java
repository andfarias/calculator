package com.andersonfariasdev.calculator.strategy;

public class DivisionStrategy implements OperationStrategy {
    @Override
    public Double calculate(Double oneNumber, Double anotherNumber) {
        return oneNumber / anotherNumber;
    }
}
