package practice.homework;

public class SecondHomeWork {
    public static void main(String[] args) {
        // for
        int[] numbers = {6, 13, 17, 112, 24, 9, 30, 8, 77, 168, 37, 911, 16, 99};
        for (int i = 0; i < numbers.length; i++) {
            int valueOfRemainder = numbers[i]%2;
            if(valueOfRemainder == 0) {
                String result = String.format("%d is even number", numbers[i]);
                System.out.println(result);
            }
        }

        // empty line
        System.out.println("");

        // improved for
        int[] arrayOfNumbers = {6, 13, 17, 112, 24, 9, 30, 8, 77, 168, 37, 911, 16, 99};
        for (int number : arrayOfNumbers) {
            int valueOfRemainder = number%2;
            if(valueOfRemainder == 0) {
                String result = String.format("%d is even number", number);
                System.out.println(result);
            }
        }
    }
}
