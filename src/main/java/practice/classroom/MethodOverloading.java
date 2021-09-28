package practice.classroom;

public class MethodOverloading {
    public static void main(String[] args) {

        printInformation("Tomass Loiko");
        printInformation("Tomas", 44);
        printInformation("Tomas", 44, "Versus");

    }

    public static void printInformation(String name) {
        System.out.println("Your name is: " + name);
    }

    public static void printInformation(String name, int age) {
        System.out.println("Your name is: " + name);
        System.out.println(("Your age is: " + age));
    }

    public static void printInformation(String name, int age, String horoscope) {
        System.out.println("Your name is: " + name);
        System.out.println(("Your age is: " + age));
        System.out.println(("Your horoscope is: " + horoscope));
    }



}
