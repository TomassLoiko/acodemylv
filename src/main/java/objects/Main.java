package objects;

public class Main {
    public static void main(String[] args) {

        Person john = new Person();
        john.name = "John";
        john.surname = "Doe";
        john.age = 20;
        john.weight = 70.6;
        john.isHetero = true;
        john.retrieveInformation();

        Person andrey = new Person("Andrey", "Chebupelli");
//        andrey.name = "Not Andrey";
        andrey.age = 21;
        andrey.weight = 60.3;
        andrey.isHetero = false;
        andrey.retrieveInformation();

        Person angelica = new Person("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();
    }
}
