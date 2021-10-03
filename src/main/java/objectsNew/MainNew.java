package objectsNew;

public class MainNew {
    public static void main(String[] args) {

        PersonNew john = new PersonNew();
        john.setNameNew("John");
        john.setSurnameNew("Doe");
        john.setAgeNew(20);
        john.setWeightNew(70.6);
        john.setHeteroNew(true);
        john.retrieveInformation();

        PersonNew andrey = new PersonNew("Andrew", "Chebupelli");
        andrey.setAgeNew(21);
        System.out.printf("Andrew's age is %d\n", andrey.getAgeNew());
        andrey.setWeightNew(60.3);
        andrey.setHeteroNew(false);
        andrey.retrieveInformation();

        PersonNew angelica = new PersonNew("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();
    }
}
