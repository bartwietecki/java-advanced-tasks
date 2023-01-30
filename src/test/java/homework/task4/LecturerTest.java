package homework.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LecturerTest {

    @Test
    public void testGetSpecialization() {
        Lecturer lecturer = new Lecturer("Jan Kowalski", "Kwiatowa 13", "Archeologia",
                3500);
        assertEquals("Archeologia", lecturer.getSpecialization());
    }

    @Test
    public void testSetSpecialization() {
        Lecturer lecturer = new Lecturer("Jan Kowalski", "Kwiatowa 13", "Archeologia",
                3500);
        lecturer.setSpecialization("Archeologia");
        assertEquals("Archeologia", lecturer.getSpecialization());
    }

    @Test
    public void testGetSalary() {
        Lecturer lecturer = new Lecturer("Jan Kowalski", "Kwiatowa 13", "Archeologia",
                3500);
        assertEquals(3500, lecturer.getSalary());
    }

    @Test
    public void testSetSalary() {
        Lecturer lecturer = new Lecturer("Jan Kowalski", "Kwiatowa 13", "Archeologia",
                3500);
        lecturer.setSalary(3500);
        assertEquals(3500, lecturer.getSalary());
    }

    // Metoda showDetails ???
    @Test
    public void testShowDetails() {

    }

}