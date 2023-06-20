package controller;

import complex.model.*;

import view.*;

public class Controller {
    View view;

    public Controller(View view) {
        this.view = view;
    }

    public void buttonClick() {
        Complex c1 = new Complex(view.getValue("Действительная часть первого числа: "),
                view.getValue("Мнимая часть первого числа: "));
        char operation = view.getOperationSign("Введи операцию (+, -, *, /): ");
        Complex c2 = new Complex(view.getValue("Действительная часть второго числа: "),
                view.getValue("Мнимая часть второго числа: "));
        switch (operation) {
            case '+' -> {
                ComplexOperation complexOperation = new ComplexAddition();
                Complex result = complexOperation.mathOperation(c1, c2);
                complexOperation.print(result);
            }
            case '-' -> {
                ComplexOperation complexOperation = new ComplexSubstraction();
                Complex result = complexOperation.mathOperation(c1, c2);
                complexOperation.print(result);
            }
            case '*' -> {
                ComplexOperation complexOperation = new ComplexMultiplication();
                Complex result = complexOperation.mathOperation(c1, c2);
                complexOperation.print(result);
            }
            case '/' -> {
                ComplexOperation complexOperation = new ComplexDivision();
                Complex result = complexOperation.mathOperation(c1, c2);
                complexOperation.print(result);
            }
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}