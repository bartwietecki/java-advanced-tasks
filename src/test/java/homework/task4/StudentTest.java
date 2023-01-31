package homework.task4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {


    // zmienne zadeklarowane dla testu metody showDetails
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Student student;


    @Test
    public void testGetStudiesType(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        assertEquals("Filologia angielska", student.getTypeOfStudies());
    }

    @Test
    public void testSetStudiesType(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        student.setTypeOfStudies("Filologia angielska");
        assertEquals("Filologia angielska", student.getTypeOfStudies());
    }

    @Test
    public void testGetYearOfStudies(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        assertEquals(4, student.getYearOfStudies());
    }

    @Test
    public void testSetYearOfStudies(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        student.setYearOfStudies(4);
        assertEquals(4, student.getYearOfStudies());
    }

    @Test
    public void testGetCostsOfStudies(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        assertEquals(20_000, student.getCostsOfStudies());
    }

    @Test
    public void testSetCostsOfStudies(){
        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20_000);
        student.setCostsOfStudies(20_000);
        assertEquals(20_000, student.getCostsOfStudies());
    }

    // test dla metody showDetails
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
                4, 20000);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testShowDetails1() {
        student.showDetails();
        String expectedOutput = "Student details:\r\n" +
                "Name: Jan Kowalski\r\n" +
                "Address: Kwiatowa 13\r\n" +
                "Type of studies: Filologia angielska\r\n" +
                "Year of studies: 4\r\n" +
                "Costs of studies: 20000\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}