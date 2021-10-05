package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio");

        double addition = calculator.add(10, 15);
        System.out.println(addition);

        double subtract = calculator.subtract(30, 8);
        System.out.println(subtract);

        double multiply = calculator.multiply(9, 4);
        System.out.println(multiply);

        double divide = calculator.divide(30, 5);
        System.out.println(divide);



    }

}
