package com.andersonfariasdev.calculator;

import com.andersonfariasdev.calculator.ui.Calculator;
import com.andersonfariasdev.calculator.ui.TerminalCalculator;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        Calculator calculatorTerminal = new TerminalCalculator(scanner);
        calculatorTerminal.init();
    }
}