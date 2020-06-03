package com.startjava.lesson_4.calculator;

public class Calculator {

    private String example;
    private String array[];
    private String operation;

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void calculate() {
        String array[] = example.split(" ");
        String operation =array[1];
        double result;
        switch (operation.charAt(0)) {
            case '+':
                result = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);;
                System.out.println(Integer.parseInt(array[0]) + " + " + Integer.parseInt(array[2]) + " = " + result);
                break;
            case '-':
                result = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
                System.out.println(Integer.parseInt(array[0]) + " - " + Integer.parseInt(array[2]) + " = " + result);
                break;
            case '*':
                result = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
                System.out.println(Integer.parseInt(array[0]) + " * " + Integer.parseInt(array[2]) + " = " + result);
                break;
            case '/':
                result = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
                System.out.println(Integer.parseInt(array[0]) + " / " + Integer.parseInt(array[2]) + " = " + result);
                break;
            case '%':
                result = Integer.parseInt(array[0]) % Integer.parseInt(array[2]);
                System.out.println(Integer.parseInt(array[0]) + " % " + Integer.parseInt(array[2]) + " = " + result);
                break;
            case '^':
                result = Math.pow(Integer.parseInt(array[0]),Integer.parseInt(array[2]));
                System.out.println(Integer.parseInt(array[0]) + " ^ " + Integer.parseInt(array[2]) + " = " + result);
                break;
            default:
                System.out.println("Введена неизвестная операция");
        }
    }
}

