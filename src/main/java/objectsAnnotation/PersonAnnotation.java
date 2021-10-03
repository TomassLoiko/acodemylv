package objectsAnnotation;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Slf4j

public class PersonAnnotation {
    private String nameAnnotation;
    private String surnameAnnotation;
    private int ageAnnotation;
    private double weightAnnotation;
    private boolean isHeteroAnnotation;

    public void retrieveInformation() {
        log.info("\nName is: {}Surname is: {}Age is: {}Weight is: {}Is hetero: {}\n", nameAnnotation, surnameAnnotation, ageAnnotation, weightAnnotation, isHeteroAnnotation);
//        System.out.printf("Name is: %s\nSurname is: %s\nAge is: %d\nWeight is: %f\nIs hetero: %s\n", nameAnnotation, surnameAnnotation, ageAnnotation, weightAnnotation, isHeteroAnnotation);
        System.out.println();
    }

//    @NoArgsConstructor
//    public PersonAnnotation() {
//    }

    public PersonAnnotation(String nameAnnotation, String surnameAnnotation) {
        this.nameAnnotation = nameAnnotation;
        this.surnameAnnotation = surnameAnnotation;
    }

//    @AllArgsConstructor
//    public PersonAnnotation(String nameAnnotation, String surnameAnnotation, int ageAnnotation, double weightAnnotation, boolean isHeteroAnnotation) {
//        this.nameAnnotation = nameAnnotation;
//        this.surnameAnnotation = surnameAnnotation;
//        this.ageAnnotation = ageAnnotation;
//        this.weightAnnotation = weightAnnotation;
//        this.isHeteroAnnotation = isHeteroAnnotation;
//    }

//    @Override
//    public String toString() {
//        return "Name: " + this.nameAnnotation;
//    }

//    RMB > Generate... > toString > Fields > OK
//    @Override
//    public String toString() {
//        return "PersonAnnotation{" + "nameAnnotation='" + nameAnnotation + '\'' + ", surnameAnnotation='" + surnameAnnotation + '\'' + ", ageAnnotation=" + ageAnnotation + ", weightAnnotation=" + weightAnnotation + ", isHeteroAnnotation=" + isHeteroAnnotation + '}';
//    }

}
