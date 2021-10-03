package objectsNew;

public class PersonNew {
    private String nameNew;
    private String surnameNew;
    private int ageNew;
    private double weightNew;
    private boolean isHeteroNew;

    public void retrieveInformation() {
        System.out.printf("Name is: %s\nSurname is: %s\nAge is: %d\nWeight is: %f\nIs hetero: %s\n", nameNew, surnameNew, ageNew, weightNew, isHeteroNew);
        System.out.println();
    }

    public PersonNew() {
    }

    public PersonNew(String nameNew, String surnameNew) {
        this.nameNew = nameNew;
        this.surnameNew = surnameNew;
    }

    public PersonNew(String nameNew, String surnameNew, int ageNew, double weightNew, boolean isHeteroNew) {
        this.nameNew = nameNew;
        this.surnameNew = surnameNew;
        this.ageNew = ageNew;
        this.weightNew = weightNew;
        this.isHeteroNew = isHeteroNew;
    }

    public void setNameNew(String nameNew) {
        this.nameNew = nameNew;
    }

    public void setSurnameNew(String surnameNew) {
        this.surnameNew = surnameNew;
    }

    public void setAgeNew(int ageNew) {
        this.ageNew = ageNew;
    }

    public void setWeightNew(double weightNew) {
        this.weightNew = weightNew;
    }

    public void setHeteroNew(boolean heteroNew) {
        isHeteroNew = heteroNew;
    }

    public String getNameNew() {
        return nameNew;
    }

    public String getSurnameNew() {
        return surnameNew;
    }

    public int getAgeNew() {
        return ageNew;
    }

    public double getWeightNew() {
        return weightNew;
    }

    public boolean isHeteroNew() {
        return isHeteroNew;
    }
}
