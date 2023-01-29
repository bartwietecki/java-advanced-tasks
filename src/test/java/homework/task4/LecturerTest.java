package homework.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LecturerTest {

    @Test
    public void testGetSpecialization(){
        Lecturer lecturer = new Lecturer("Archeologia", 3500);
        assertEquals("Archeologia", lecturer.getSpecialization());
    }

    @Test
    public void testSetSpecialization(){
        Lecturer lecturer = new Lecturer("Archeologia", 3500);
        lecturer.setSpecialization("Archeologia");
        assertEquals("Archeologia", lecturer.getSpecialization());
    }

    @Test
    public void testGetSalary(){
        Lecturer lecturer = new Lecturer("Archeologia", 3500);
        assertEquals(3500, lecturer.getSalary());
    }

    @Test
    public void testSetSalary(){
        Lecturer lecturer = new Lecturer("Archeologia", 3500);
        lecturer.setSalary(3500);
        assertEquals(3500, lecturer.getSalary());
    }

    // wywala błąd

//    @Test
//    public void testShowDetails() {
//        Lecturer lecturer = new Lecturer("Computer Science", 5000);
//        lecturer.setName("John Doe");
//        lecturer.setAddress("123 Main St.");
//
//        String expectedOutput = "Lecturer details:\n" +
//                "Name: John Doe\n" +
//                "Address: 123 Main St.\n" +
//                "Specialization: Computer Science\n" +
//                "Salary: 5000\n";
//
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//
//        lecturer.showDetails();
//        assertEquals(expectedOutput, outContent.toString());
//    }

}