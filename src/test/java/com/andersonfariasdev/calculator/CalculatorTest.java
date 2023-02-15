package com.andersonfariasdev.calculator;

import com.andersonfariasdev.calculator.enuns.CalculatorOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void mustPerformAdditionOperation() {
        CalculatorOperation calculatorOperation = CalculatorOperation.ADDITION;
        assertEquals(4.0, calculatorOperation.getOperationStrategy().calculate(1.0, 3.0));
    }

    @Test
    void mustPerformSubtractionOperation() {
        CalculatorOperation calculatorOperation = CalculatorOperation.SUBTRACTION;
        assertEquals(1.0, calculatorOperation.getOperationStrategy().calculate(3.0, 2.0));
    }

    @Test
    void mustPerformMultiplicationOperation() {
        CalculatorOperation calculatorOperation = CalculatorOperation.MULTIPLICATION;
        assertEquals(6.0, calculatorOperation.getOperationStrategy().calculate(3.0, 2.0));
    }

    @Test
    void mustPerformDivisionOperation() {
        CalculatorOperation calculatorOperation = CalculatorOperation.DIVISION;
        assertEquals(1.0, calculatorOperation.getOperationStrategy().calculate(2.0, 2.0));
    }
}
