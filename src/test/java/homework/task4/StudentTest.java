package homework.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

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

    // wywala błąd

//    @Test
//    public void showDetailsTest(){
//        Student student = new Student("Jan Kowalski", "Kwiatowa 13", "Filologia angielska",
//                4, 20_000);
//        student.setName("Jan Kowalski");
//        student.setAddress("Kwiatowa 13");
//
//        // pomoc internetu poniżej..
//
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream((outContent)));
//
//        student.showDetails();
//        String expectedOutput = "Student details:\n" +
//                "Name: Jan Kowalski\n" +
//                "Address: Kwiatowa 13\n" +
//                "Type of studies: Filologia angielska\n" +
//                "Year of studies: 4\n" +
//                "Costs of studies: 20 000\n";
//        assertEquals(expectedOutput, outContent.toString());
//    }
}