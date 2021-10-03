package objectsAnnotation;

public class MainAnnotation {
    public static void main(String[] args) {

        PersonAnnotation john = new PersonAnnotation();
        john.setNameAnnotation("John");
        john.setSurnameAnnotation("Doe");
        john.setAgeAnnotation(20);
        john.setWeightAnnotation(70.6);
        john.setHeteroAnnotation(true);
        john.retrieveInformation();

        PersonAnnotation andrey = new PersonAnnotation("Andrew", "Chebupelli");
        andrey.setAgeAnnotation(21);
        andrey.setWeightAnnotation(60.3);
        andrey.setHeteroAnnotation(false);
        andrey.retrieveInformation();

        PersonAnnotation angelica = new PersonAnnotation("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();

        System.out.println(angelica);
    }
}
