package practice.homework;

public class FirstHomeWork {
    public static void main(String[] args) {
        // double primitive data type
        double constantPi = 3.14159265358979323846264d;
        System.out.println("Value of constant pi is " + constantPi);

        double naturalLogBase = 2.71828182845904523536d;
        System.out.printf("Value of Euler's number is %.15f\n", naturalLogBase);

        double valueEulerMascheroniConst = 0.577215664901532860606512090082d;
        System.out.printf("Value of Euler-Mascheroni constant is %.15f\n", valueEulerMascheroniConst);

        double valueGoldenRatio = 1.618033988749894;
        String goldenRatio = String.format("Golden ratio is %.15f\n", valueGoldenRatio);
        System.out.print(goldenRatio);

        double valueGaussianGravitationalConst = 0.017202098950000d;
        String gravitationalConst = String.format("Value of Gaussian gravitational constant is %.11f\n", valueGaussianGravitationalConst);
        System.out.println(gravitationalConst);

        // float primitive data type
        float probablyNumberOfAtomsInOurGalaxy = Float.MAX_VALUE;
        System.out.println("Probably the number of atoms in the Milky Way galaxy is: " + probablyNumberOfAtomsInOurGalaxy + "\n");

        float stateBudget2021InRevenue = 9585268895f;
        System.out.printf("Apstiprināts valsts budžets 2021. gadam ieņēmumos ir %.2f euro\n", stateBudget2021InRevenue);

        float stateBudget2021InExpenditure = 10764811284f;
        System.out.printf("Apstiprināts valsts budžets 2021. gadam izdevumos ir %.2f euro\n", stateBudget2021InExpenditure);

        float centralGovernmentBudgetDeficit2020 = -1420800000f;
        String centralGovernmentDeficit2020 = String.format("2020. gadā centrālas valdības budžetā deficīts ir %.0f euro\n", centralGovernmentBudgetDeficit2020);
        System.out.print(centralGovernmentDeficit2020);

        float generalGovernmentBudgetDeficit2020 = -1326600000f;
        String generalGovernmentDeficit2020 = String.format("2020. gadā vispārējās valdības budžetā deficīts ir %.0f euro\n", generalGovernmentBudgetDeficit2020);
        System.out.println(generalGovernmentDeficit2020);

        // long primitive data type
        long  numberOfHieroglyphsEgyptian = 1000;
        System.out.println("Egyptian alphabetic elements includes about " + numberOfHieroglyphsEgyptian + " distinct characters.");

        long numberOfRussianLetters = 33;
        System.out.printf("In the Russian alphabet %d letters.\n", numberOfRussianLetters);

        long numberOfEnglishLetters = 26;
        System.out.printf("There are %d letters in the English alphabet.\n", numberOfEnglishLetters);

        long numberOfStandardLettersDe = 26;
        long numberOfAdditionalSymbolsDe = 4;
        String numberOfLettersDe = String.format("There are %d standard letters in German alphabet and %d additional symbols.\n", numberOfStandardLettersDe, numberOfAdditionalSymbolsDe);
        System.out.println(numberOfLettersDe);

        // int primitive data type
        // char primitive data type
        // short primitive data type
        short numberOfDaysOnWeek = 7;
        System.out.println("Number of days in a week is: " + numberOfDaysOnWeek + "\n");

//        short stateBudget2021InRevenue = 9585268895f;
//        System.out.printf("Apstiprināts valsts budžets 2021. gadam ieņēmumos ir %.2f euro\n", stateBudget2021InRevenue);
//
//        short stateBudget2021InExpenditure = 10764811284f;
//        System.out.printf("Apstiprināts valsts budžets 2021. gadam izdevumos ir %.2f euro\n", stateBudget2021InExpenditure);
//
//        short centralGovernmentBudgetDeficit2020 = -1420800000f;
//        String centralGovernmentDeficit2020 = String.format("2020. gadā centrālas valdības budžetā deficīts ir %.0f euro\n", centralGovernmentBudgetDeficit2020);
//        System.out.print(centralGovernmentDeficit2020);
//
//        short generalGovernmentBudgetDeficit2020 = -1326600000f;
//        String generalGovernmentDeficit2020 = String.format("2020. gadā vispārējās valdības budžetā deficīts ir %.0f euro\n", generalGovernmentBudgetDeficit2020);
//        System.out.print(generalGovernmentDeficit2020);

        // byte primitive data type
        // boolean primitive data type
        boolean isCold = true;
        boolean isHot = false;
        String temperatureLevel = String.format("It's cold on the dark side of the moon: %b\nIt's cold on the sunny side of the moon: %b\n", isCold, isHot);
        System.out.println(temperatureLevel);


        // String non-primitive data type


    }
}
