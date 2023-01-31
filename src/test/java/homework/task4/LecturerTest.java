package homework.task4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LecturerTest {

    // zmienne zadeklarowane dla testu metody showDetails
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Lecturer lecturer;


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


    // test dla metody showDetails
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        lecturer = new Lecturer("Jan Kowalski", "Kwiatowa 13", "Archeologia", 3500);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testShowDetails1() {
        lecturer.showDetails();
        String expectedOutput = "Lecturer details:\r\n" +
                "Name: Jan Kowalski\r\n" +
                "Address: Kwiatowa 13\r\n" +
                "Specialization: Archeologia\r\n" +
                "Salary: 3500\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}