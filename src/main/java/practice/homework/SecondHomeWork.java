package practice.homework;

public class SecondHomeWork {
    public static void main(String[] args) {
        int[] numbers = {6, 13, 17, 112, 24, 9, 30, 8, 77, 168, 37, 911, 13, 99, };
        for (int i = 0; i < numbers.length; i++) {
            int valueOfRemainder = numbers[i]%2;
            if(valueOfRemainder == 0) {
                String result = String.format("%d is even number", numbers[i]);
                System.out.println(result);
            }
        }
    }
}
