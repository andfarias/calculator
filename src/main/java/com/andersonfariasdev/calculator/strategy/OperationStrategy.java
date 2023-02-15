package com.andersonfariasdev.calculator.strategy;

import com.andersonfariasdev.calculator.exception.InvalidOperationException;

public interface OperationStrategy {
    Double calculate(Double oneNumber, Double anotherNumber) throws InvalidOperationException;
}
