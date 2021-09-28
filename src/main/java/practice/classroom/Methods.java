package practice.classroom;

import java.sql.SQLOutput;

public class Methods {
    public static void main(String[] args) {
        int y = 1;
        int x = 2;
        int result = y + x;
        System.out.println("Your result: " + result);

        sum(1, 10);

        int sumResult = returnSum(2, 20);
        System.out.println("Sum result is: " + sumResult);

    }

    public static void sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Your result: " + result);
    }

    public static int returnSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


}
