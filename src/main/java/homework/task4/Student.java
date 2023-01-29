package homework.task4;

public class Student extends Person {
    String typeOfStudies;
    int yearOfStudies;
    int costsOfStudies;

    public Student(String name, String address, String typeOfStudies, int yearOfStudies, int costsOfStudies) {
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.costsOfStudies = costsOfStudies;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getCostsOfStudies() {
        return costsOfStudies;
    }

    public void setCostsOfStudies(int costsOfStudies) {
        this.costsOfStudies = costsOfStudies;
    }

    @Override
    public void showDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Type of studies: " + typeOfStudies);
        System.out.println("Year of studies: " + yearOfStudies);
        System.out.println("Costs of studies: " + costsOfStudies);
    }
}
