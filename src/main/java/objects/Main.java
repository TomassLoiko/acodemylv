package objects;

public class Main {
    public static void main(String[] args) {

        Person john = new Person();
        john.setName(John);
        john.setSurname(Doe);
        john.setAge(20);
        john.setWeight(70.6);
        john.setHetero(true);
        john.retrieveInformation();

        Person andrey = new Person("Andrey", "Chebupelli");
        andrey.age = 21;
        andrey.weight = 60.3;
        andrey.isHetero = false;
        andrey.retrieveInformation();

        Person angelica = new Person("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();



    }

}
