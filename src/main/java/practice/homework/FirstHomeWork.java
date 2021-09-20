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
        String gravitationalConst = String.format("Value of Gaussian gravitational constant is %.11f\n",
                valueGaussianGravitationalConst);
        System.out.println(gravitationalConst);

        // float primitive data type
        float probablyNumberOfAtomsInOurGalaxy = Float.MAX_VALUE;
        System.out.println("Probably the number of atoms in the Milky Way galaxy is: " + probablyNumberOfAtomsInOurGalaxy);

        float stateBudget2021InRevenue = 9585268895f;
        System.out.printf("Apstiprināts valsts budžets 2021. gadam ieņēmumos ir %.2f euro\n", stateBudget2021InRevenue);

        float stateBudget2021InExpenditure = 10764811284f;
        System.out.printf("Apstiprināts valsts budžets 2021. gadam izdevumos ir %.2f euro\n",
                stateBudget2021InExpenditure);

        float centralGovernmentBudgetDeficit2020 = -1420800000f;
        String centralGovernmentDeficit2020 =
                String.format("2020. gadā centrālas valdības budžetā deficīts ir %.0f " + "euro\n",
                        centralGovernmentBudgetDeficit2020);
        System.out.print(centralGovernmentDeficit2020);

        float generalGovernmentBudgetDeficit2020 = -1326600000f;
        String generalGovernmentDeficit2020 = String.format("2020. gadā vispārējās valdības budžetā deficīts ir %.0f "
                + "euro\n", generalGovernmentBudgetDeficit2020);
        System.out.println(generalGovernmentDeficit2020);

        // long primitive data type
        long numberOfHieroglyphsEgyptian = 1000;
        System.out.println("Egyptian alphabetic elements includes about " + numberOfHieroglyphsEgyptian + " distinct "
                + "characters.");

        long numberOfRussianLetters = 33;
        System.out.printf("In the Russian alphabet %d letters.\n", numberOfRussianLetters);

        long numberOfEnglishLetters = 26;
        System.out.printf("There are %d letters in the English alphabet.\n", numberOfEnglishLetters);

        long numberOfStandardLettersDe = 26;
        long numberOfAdditionalSymbolsDe = 4;
        String numberOfLettersDe = String.format("There are %d standard letters in German alphabet and %d additional "
                + "symbols.\n", numberOfStandardLettersDe, numberOfAdditionalSymbolsDe);
        System.out.println(numberOfLettersDe);

        // int primitive data type
        int computerInFlat = 6;
        int tvInFlat = 1;
        int soundDeviceInFlat = 15;
        int windowInFlat = 4;
        int doorInFlat = 7;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n\n", computerInFlat, tvInFlat, soundDeviceInFlat, windowInFlat, doorInFlat);

        // char primitive data type
        char firstCharOfHi = '\u0048';
        char secondCharOfHi = '\u0069';
        char firstCharOfAll = '\u0041';
        char secondCharOfAll = '\u006C';
        char thirdCharOfAll = '\u006C';
        System.out.println(firstCharOfHi);
        System.out.println(secondCharOfHi+"\n");
        System.out.println(firstCharOfAll);
        System.out.println(secondCharOfAll);
        System.out.println(thirdCharOfAll+"\n");

        // short primitive data type
        short numberOfDaysInWeek = 7;
        System.out.println("The number of days in a week is: " + numberOfDaysInWeek);

        short numberOfDaysInYear = 365;
        System.out.printf("The number of days in a year is: %d\n", numberOfDaysInYear);

        short numberOfMonthInYear = 12;
        System.out.printf("The number of month in a year is: %d\n", numberOfMonthInYear);

        short numberOfSecondsInMinute = 60;
        String stringNumberOfSecondInMinute = String.format("The number of seconds in a minute is: %d\n", numberOfSecondsInMinute);
        System.out.print(stringNumberOfSecondInMinute);

        short numberOfHoursInDay = 24;
        String stringNumberOfHoursInDay = String.format("The number of hours in a day is: %d\n", numberOfHoursInDay);
        System.out.println(stringNumberOfHoursInDay);

        // byte primitive data type
        byte primarySchoolLastClass = 9;
        byte secondarySchoolLastClass = 12;
        byte maxNumberOfChildInClass = 30;
        byte minNumberOfStudentInGroup = 10;
        byte maxNumberOfTeacherInClass = 1;
        System.out.printf("%d\n%d\n%d\n%d\n%d\n\n", primarySchoolLastClass, secondarySchoolLastClass, maxNumberOfChildInClass, minNumberOfStudentInGroup, maxNumberOfTeacherInClass);

        // boolean primitive data type
        boolean isCold = true;
        boolean isHot = false;
        String temperatureLevel = String.format("It's cold on the dark side of the moon: %b\nIt's cold on the sunny side of the moon: %b\n", isCold, isHot);
        System.out.println(temperatureLevel);

        // String non-primitive data type
        String myName = "Tomass";
        String myLastName = "Loiko";
        int workExperience = 18;
        String myFirstSkill = "planning, organizing and monitoring work performance";
        String mySecondSkill = "resource management";
        String myThirdSkill = "quality assurance and control";
        String myFourthSkill = "risk analysis";
        String myFifthSkill = "teamwork";
        String mySixthSkill = "communications";
        String myFirstPersonalQuality = "responsibility";
        String mySecondPersonalQuality = "punctuality";
        String myThirdPersonalQuality = "analytical thinking";
        String myFourthPersonalQuality = "dedication";
        String myResume = String.format("My name is %s %s. My previous work experience, for the last %d years, " +
                "was associated\nwith production management. I have a full range of skills that relate to this " +
                "profession,\nsuch as %s, %s,\n%s, %s, %s, %s and others,\nrequired in this profession. My " +
                "best personal qualities are %s,\n%s, %s and %s.", myName, myLastName, workExperience,
                myFirstSkill, mySecondSkill, myThirdSkill, myFourthSkill, myFifthSkill, mySixthSkill,
                myFirstPersonalQuality, mySecondPersonalQuality, myThirdPersonalQuality, myFourthPersonalQuality);
        System.out.println(myResume);
    }
}
