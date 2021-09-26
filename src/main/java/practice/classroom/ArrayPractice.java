package practice.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        // Create empty massive (Dynamic massive) and fill in with values
        int[] arrayOfNumbers = new int[3];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 2;
        arrayOfNumbers[2] = 3;
        System.out.println(Arrays.toString(arrayOfNumbers));

        // String massive
        String[] names = {"Tomas", "Nikita", "Sergej", "Vjacheslav"};

        // Dynamic string massive and fill in
        String[] emptyArray = new String[4];
        emptyArray[0] = "Nikolaj";
        emptyArray[1] = "Max";
        emptyArray[2] = "John";
        emptyArray[3] = "Mary";
        //emptyArray[4] = "Gleb"; // the case with error "Out Of Bounds"
        System.out.println(Arrays.toString(emptyArray));
        System.out.println(emptyArray[0] +" "+ emptyArray[1]);

        // boolean variables massive
        boolean[] booleanArray = {true, false, false, true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[1];
        System.out.printf("Outside is quite hot: %s", isHotOutside);

        // ArrayList massive
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);

        // ArrayList massive with autoboxing
        List<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add('A');
        listOfObjects.add(120);
        listOfObjects.add("Hello");
        listOfObjects.add("world!");

    }
}
