package practice.classroom;

public class LoopPractice {
    public static void main(String[] args) {

        /*
        for(statement1; statement2; statement3) {
        code block to be executed
        }
        statement1 - is executed (one time) of the code block
        // Initialize counter variable: (int i = 0);

        statement2 - define the condition for executing the code block
        // Boolean condition
        // Element list = 10;
        // i < 10;

        statement - is executed (every time) after the code block has executed
        // Increment/Decrement (i++/i--)
         */


        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        String[] names = {"Nikita", "Andrew", "Max", "Antony"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }

       int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 4) {
            System.out.println(numbers[i]);
            } else {
                System.out.println("Other numbers: " + numbers[i]);
            }
        }

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Max") || names[i].equals("Nikita")) {
            System.out.println(names[i]);
            }
        }

        for (String name : names) {
            if (name.equals("Max")) {
            System.out.println(name);
            }
        }


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


        for (int i = numbers.length - 1; i >= 0; --i) {
            System.out.println(numbers[i]);
        }


    }

}
