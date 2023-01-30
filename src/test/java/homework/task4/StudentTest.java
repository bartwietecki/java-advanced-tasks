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

    // Metoda showDetails ???
    @Test
    public void testShowDetails() {

    }

}