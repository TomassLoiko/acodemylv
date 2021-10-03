package objects;

public class Person {

    public String name;
    public String surname;
    public int age;
    public double weight;
    public boolean isHetero;

    public void retrieveInformation() {
        System.out.printf("Name is: %s\nSurname is: %s\nAge is: %d\nWeight is: %f\nIs hetero: %s\n", name, surname, age, weight, isHetero);
        System.out.println();
    }

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, double weight, boolean isHetero) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.isHetero = isHetero;
    }
}
