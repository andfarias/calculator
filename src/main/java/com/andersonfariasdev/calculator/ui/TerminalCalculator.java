package com.andersonfariasdev.calculator.ui;

import com.andersonfariasdev.calculator.enuns.CalculatorOperation;
import com.andersonfariasdev.calculator.exception.InvalidOperationException;

import java.util.Scanner;

public class TerminalCalculator implements Calculator {

    Scanner scanner;

    public TerminalCalculator(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void init() {
        double oneNumber, anotherNumber;
        while (true) {
            System.out.println("Please Enter The First Number");
            oneNumber = readDouble();

            System.out.println("Please Enter The Second Number");
            anotherNumber = readDouble();

            Double result = readOperation().getOperationStrategy().calculate(oneNumber, anotherNumber);
            System.out.print("Your Answer is " + result + "\n\n=========================\n\n");
        }
    }

    private double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("Must be number! ");
            }
        }
    }

    private CalculatorOperation readOperation() {
        while (true) {
            try {
                System.out.println("Please Enter The Operation (+,-,*,/)");
                String operation = scanner.next();
                return CalculatorOperation.fromCodigo(operation);
            } catch (InvalidOperationException e) {
                System.out.print("You need to enter a valid operator (+,-,*,/).");
            }
        }
    }
}
