package calculator;

import java.text.DecimalFormat;

public class Calculator {

    private String calculatorName;
    DecimalFormat df = new DecimalFormat("###.##");

    public String getCalculatorName() {
        return calculatorName;
    }

    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public double add(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber + secondNumber));
    }

    public double subtract(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber - secondNumber));
    }

    public double multiply(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber * secondNumber));
    }

    public double divide(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber / secondNumber));
    }



}
//package calculator;
//
//import java.text.DecimalFormat;
//
//public class Calculator {
//
//    private String calculatorName;
//    DecimalFormat df = new DecimalFormat("###.##");
//
//    public Calculator(String calculatorName) {
//        this.calculatorName = calculatorName;
//    }
//
//    public double add(double firstNumber, double secondNumber) {
//        return Double.parseDouble(df.format(firstNumber + secondNumber));
//    }
//
//    public double subtract(double firstNumber, double secondNumber) {
//        return Double.parseDouble(df.format(firstNumber - secondNumber));
//    }
//
//    public double multiply(double firstNumber, double secondNumber) {
//        return Double.parseDouble(df.format(firstNumber * secondNumber));
//    }
//
//    public double divide(double firstNumber, double secondNumber) {
//        return Double.parseDouble(df.format(firstNumber / secondNumber ));
//    }
//}