package com.startjava.lesson_4.calculator;

public class Calculator {

    private String srcMathExp;
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setExample(String example) {
        this.srcMathExp = example;
    }

    public void calculate() {

        String splitMatExp[] = srcMathExp.split(" ");
        char operation = splitMatExp[1].charAt(0);
        int variable1 = Integer.parseInt(splitMatExp[0]);
        int variable2 = Integer.parseInt(splitMatExp[2]);
        switch (operation) {
            case '+':
                setResult(variable1 + variable2);
                break;
            case '-':
                setResult(variable1 - variable2);
                break;
            case '*':
                setResult(variable1 * variable2);
                break;
            case '/':
                setResult(variable1 / variable2);
                break;
            case '%':
                setResult(variable1 % variable2);
                break;
            case '^':
                setResult(Math.pow(variable1,variable2));
                break;
            default:
                System.out.println("Введена неизвестная операция");
        }
    }
}