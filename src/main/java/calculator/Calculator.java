package calculator;

import lombok.SneakyThrows;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Calculator {

    private String calculatorName;
    DecimalFormat df = new DecimalFormat("###.##");
    NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);

    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public double add(double firstNumber, double secondNumber) {
        return Double.parseDouble(df.format(firstNumber + secondNumber));
    }

    @SneakyThrows
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