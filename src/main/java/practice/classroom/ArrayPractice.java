package practice.classroom;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // data type
        // []
        // name

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // [0] = 1
        // [1] = 2
        // [2] = 3
        // ...
        int firstNumber = numbers[0];
        System.out.println(firstNumber);


        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 2;
        arrayOfNumbers[2] = 3;
        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Tomas", "Nikita", "Sergej", "Vjacheslav"};
        String[] emptyArray = new String[4];
        emptyArray[0] = "Nikolaj";
        emptyArray[1] = "Max";
        emptyArray[2] = "John";
        emptyArray[3] = "Mary";
        //emptyArray[4] = "Gleb";
        System.out.println(Arrays.toString(emptyArray));

        boolean[] booleanArray = {true, false, false, true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[1];
        System.out.printf("Otside is quite hot: %s", isHotOutside);

    }
}
