package homework.task4;

public class Lecturer extends Person{
    String specialization;
    int salary;

    public Lecturer(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Lecturer details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
    }
}
