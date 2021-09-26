package practice.homework;

public class SecondHomeWork {
    public static void main(String[] args) {
        // 1) If variable int == 10 then print variable int
        int variableToOutput = 10;
        if (variableToOutput == 10) {
            System.out.println("Integer value is " + variableToOutput + "\n");
        } else System.out.println("Variable doesn't match\n");

        // 2) Discounts on dry cleaning services
        int ageOfClient = 21;
        int discountLevel = 0;
        String ageGroup = "You can't use dry cleaning, check your age";
        if (ageOfClient >= 18 && ageOfClient <= 21) {
            discountLevel = 10;
            ageGroup = "You are in the age group student";
        }
        if (ageOfClient >= 22 && ageOfClient < 65) {
            discountLevel = 15;
            ageGroup = "You are in the age group adult";
        }
        if (ageOfClient >= 65) {
            discountLevel = 20;
            ageGroup = "You are in the age group retiree";
        }
        String yourDiscount = String.format("%s, your discount is %d", ageGroup, discountLevel);
        System.out.println(yourDiscount + "%.\n");

        // 3) Output of the desired animal
        String myAnimal = "cat";
        String[] arrayOfAnimal = new String[6];
        arrayOfAnimal[0] = "bear";
        arrayOfAnimal[1] = "mouse";
        arrayOfAnimal[2] = "cat";
        arrayOfAnimal[3] = "dog";
        arrayOfAnimal[4] = "camel";
        arrayOfAnimal[5] = "elephant";
        for (String animal : arrayOfAnimal) {
            if (animal == myAnimal) {
                System.out.println(animal + "\n");
            }
        }

        // 4) Output only even numbers, version with "for"
        int[] numbers = {6, 13, 17, 112, 24, 9, 30, 8, 77, 168, 37, 911, 16, 99};
        for (int i = 0; i < numbers.length; i++) {
            int valueOfRemainder = numbers[i]%2;
            if (valueOfRemainder == 0) {
                String result = String.format("%d is even number", numbers[i]);
                System.out.println(result);
            }
        }
        // empty line
        System.out.println("");

        // 4) Output only even numbers, version with "improved for"
        int[] arrayOfNumbers = {6, 13, 17, 112, 24, 9, 30, 8, 77, 168, 37, 911, 16, 99};
        for (int number : arrayOfNumbers) {
            int valueOfRemainder = number%2;
            if (valueOfRemainder == 0) {
                String result = String.format("%d is even number", number);
                System.out.println(result);
            }
        }
        // empty line
        System.out.println("");

        // 5) Transport types
        int numberOfTransport = 6;
        switch (numberOfTransport) {
            case 1:
                System.out.println("Bus\n");
                break;
            case 2:
                System.out.println("Underground\n");
                break;
            case 3:
                System.out.println("Taxi\n");
                break;
            case 4:
                System.out.println("Car\n");
                break;
            case 5:
                System.out.println("Scooter\n");
                break;
            default:
                System.out.println("Unknown transport type\n");
        }

        // 6) Numbers from 1 to 100
        for (int i = 1; i <= 100 ; i++) {
            System.out.printf("%d ", i);
        }
        // empty line
        System.out.println("\n");

        // 7) Numbers from 50 to 1
        for (int i = 50; i > 0 ; --i) {
            System.out.printf("%d ", i);
        }
        // empty line
        System.out.println("\n");

        // Multiplication table
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = j*i;
                System.out.printf("%d ", result);
            }
            System.out.println("");
        }
    }
}
